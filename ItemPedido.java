public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPrecoUnitario() {
        return getProduto().getPreco();
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.produto.setPreco(precoUnitario);
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getSubtotal() {
        return this.getPrecoUnitario() * this.getQuantidade();
    }

}
