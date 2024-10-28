package app;

import facade.PedidoFacade;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        PedidoFacade pedidoFacade = new PedidoFacade();

        // Adicionando produtos ao estoque
        Produto produto1 = new Produto(1, 10.0, "Alimento");
        Produto produto2 = new Produto(2, 20.0, "Bebida");

        pedidoFacade.adicionarProdutoNoEstoque(produto1, 5);
        pedidoFacade.adicionarProdutoNoEstoque(produto2, 10);

        // Adicionando itens ao pedido
        pedidoFacade.adicionarItemNoPedido(2, produto1);
        pedidoFacade.adicionarItemNoPedido(3, produto2);

        // Exibindo o cupom fiscal
        pedidoFacade.exibirCupomFiscal();
    }
}
