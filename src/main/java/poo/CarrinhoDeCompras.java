package poo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    private ArrayList<ItemPedido> itemPedidos; //Lista
    List<Produto> produtos = null;
    private Cliente cliente;
    private int indice=0;
    private StatusPedidos status;
    private IPagamento metodoPagamento;
    private LocalDate dataPedido;

    Scanner sc = new Scanner(System.in);


    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.status = StatusPedidos.PENDENTE;
    }
    public void adicionarItem () {
        if(indice==0) {
            itemPedidos = new ArrayList<>();
        }
        System.out.println("Escolha o produto desejado: (Exemplo: 1)");
        for(int i=0;i<produtos.size();i++) {
            System.out.printf("%d - %s - R$ %.2f - Estoque: %d\n", i+1, produtos.get(i).getNome(), produtos.get(i).getPreco(), produtos.get(i).getEstoque());
        }
        int escolha = sc.nextInt();
        Produto produto = produtos.get(escolha-1);
        System.out.println("Digite a quantidade do produto:");
        int quantidade = sc.nextInt();
        this.itemPedidos.add(new ItemPedido(produto, quantidade));
        indice++;
    }
    public void removerItem(ItemPedido item) {
        itemPedidos.remove(item);
    }
    public double calcularTotal() {
        double valor=0;
        for(int i=0;i<itemPedidos.size();i++) {
            valor+=this.itemPedidos.get(i).getSubtotal();
        }
        return valor;
    }
    public double aplicarDesconto(double porcent_desconto) {
        double valor = calcularTotal();
        valor *= ((100-porcent_desconto)/100);
        return valor;
    }
    public boolean confirmarPedido() {
        if(this.status != StatusPedidos.PENDENTE) {
            return false;
        }
        if(metodoPagamento==null) {
            return false;
        }
        if(metodoPagamento.ProcessarPagamento(this.calcularTotal())==true) 
            this.status = StatusPedidos.PROCESSANDO;
        else
            this.status = StatusPedidos.PENDENTE;
        return metodoPagamento.ProcessarPagamento(this.calcularTotal());
    }

    public ArrayList<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public StatusPedidos getStatus() {
        return status;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void setItemPedidos(ArrayList<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setStatus(StatusPedidos status) {
        this.status = status;
    }
    public void setMetodoPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
}
}
