package facade;

import model.ItemPedido;
import model.Pedido;
import model.Produto;
import service.Estoque;

public class PedidoFacade {
    private Estoque estoque;
    private Pedido pedido;

    public PedidoFacade() {
        estoque = new Estoque();
        pedido = new Pedido();
    }

    public void adicionarProdutoNoEstoque(Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    public void adicionarItemNoPedido(int quantidade, Produto produto) {
        ItemPedido itemPedido = new ItemPedido(quantidade, produto);
        pedido.adicionarItem(itemPedido, estoque);
    }

    public void exibirCupomFiscal() {
        pedido.cupomFiscal();
    }
}
