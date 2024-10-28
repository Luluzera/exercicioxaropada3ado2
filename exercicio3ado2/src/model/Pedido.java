package model;

import service.Estoque;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> lista;

    public Pedido() {
        lista = new ArrayList<>();
        valorTotal = 0.0;
    }

    public void adicionarItem(ItemPedido item, Estoque estoque) {
        if (estoque.removerProduto(item.getProduto(), item.getQuantidade())) {
            lista.add(item);
            valorTotal += item.getPreco();
        } else {
            System.out.println("Produto indisponível no estoque: " + item.getProduto().getCodigo());
        }
    }

    public double calcularTotal() {
        return valorTotal;
    }

    public void cupomFiscal() {
        for (ItemPedido item : lista) {
            System.out.println(item);
        }
        System.out.println("Total: " + calcularTotal());
    }
}
