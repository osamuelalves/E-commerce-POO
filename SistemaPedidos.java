import java.time.LocalDate;

public class SistemaPedidos {
    public static void main(String[] args) {
        Produto teclado = new Produto("Fortrek Teclado", 79.10, 10, "001", "Teclado Gamer");
        Produto mousePad = new Produto("Mouse Pad Preto", 8.90, 20, "002", "Mouse Pad Preto");
        Produto mouse = new Produto("Mouse Dell Preto", 69.00, 15, "003", "Mouse Dell Preto");

        ClientePF clientePF = new ClientePF("Samuel", "Samuel@", "044", "999", "123.456.789-10", java.time.LocalDate.of(2000, 5, 20));
        ClientePJ clientePJ = new ClientePJ("Julia", "Julia@", "723", "888", "12.345.678/0001-90", "Julia LTDA", "123456789");

        
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras(clientePF);
        carrinho1.adicionarItem(teclado, 1);
        carrinho1.adicionarItem(mouse, 0);
        carrinho1.adicionarItem(mousePad, 1);
        //valor total = 88.00
        
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras(clientePJ);
        carrinho2.adicionarItem(teclado, 0);
        carrinho2.adicionarItem(mouse, 2);
        carrinho2.adicionarItem(mousePad, 0);
        //valor total = 138.00

        System.out.printf("Valor total da compra: R$ %.2f\n", carrinho1.calcularTotal());
        System.out.printf("Valor total da compra: R$ %.2f\n", carrinho2.calcularTotal());

        double valor1D = carrinho1.aplicarDesconto(20);
        //Valor = 70.40
        double valor2D = carrinho2.aplicarDesconto(10);
        //Valor = 124.20
        
        System.out.printf("Valores com desconto: \n%.2f\n%.2f\n", valor1D, valor2D);

        PagamentoBoleto pB = new PagamentoBoleto("2", valor2D, LocalDate.now());
        carrinho1.setMetodoPagamento(pB);
        carrinho1.confirmarPedido();
        System.out.printf("Situação do pedido: %s\n", carrinho1.getStatus());
        pB.ProcessarPagamento(valor1D);
        System.out.printf("Situação do pagamento: %s\n", pB.getStatusPagamento());

        PagamentoCartaoCredito pC = new PagamentoCartaoCredito("33", "Julia", LocalDate.now());
        carrinho2.setMetodoPagamento(pC);
        carrinho2.confirmarPedido();
        System.out.printf("Situação do pedido: %s\n", carrinho2.getStatus());
        pC.ProcessarPagamento(valor2D);
        System.out.printf("Situação do pagamento: %s\n", pC.getStatusPagamento());
    }
}