
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private double total;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(ItemCardapio item, int quantidade) {
        ItemPedido itemPedido = new ItemPedido(item, quantidade);
        itens.add(itemPedido);
        calcularTotal();
    }

    public double calcularTotal() {
        total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void finalizar() {
        System.out.println("Pedido #" + numero + " finalizado. Total: R$ " + total);
    }

    public void confirmarRecebimento() {
        System.out.println("Pedido #" + numero + " confirmado pelo cliente.");
    }

    
    public int getNumero() { return numero; }
    public Cliente getCliente() { return cliente; }
    public List<ItemPedido> getItens() { return itens; }
    public double getTotal() { return total; }
}
