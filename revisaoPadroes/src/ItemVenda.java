public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public int getValorTotal() {
        return produto.getPreco() * quantidade;
    }

    // Getters and Setters
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
