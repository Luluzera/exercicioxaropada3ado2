package service;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Estoque> listaEstoque;
    private Produto produto;
    private int quantidade;

    public Estoque() {
        listaEstoque = new ArrayList<>();
    }

    public Estoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        listaEstoque.add(new Estoque(produto, quantidade));
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        for (Estoque estoque : listaEstoque) {
            if (estoque.getProduto().getCodigo() == produto.getCodigo()) {
                if (estoque.getQuantidade() >= quantidade) {
                    estoque.setQuantidade(estoque.getQuantidade() - quantidade);
                    return true;
                }
            }
        }
        return false;
    }

    public List<Estoque> retornarLista() {
        return listaEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
