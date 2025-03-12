import java.util.ArrayList;

public class Venda {
    private ArrayList<ItemVenda> itens;
    private Usuario usuario;

    public void adicionarProduto(Produto produto, int quantidade) {
        ItemVenda item = new ItemVenda();
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        itens.add(item);
    }

    // Getters and Setters
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
