public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private String id;
    private String descricao;

    public Produto(String nome, double preco, int estoque, String id, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.id = id;
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }
    public String getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        }
    }

}
