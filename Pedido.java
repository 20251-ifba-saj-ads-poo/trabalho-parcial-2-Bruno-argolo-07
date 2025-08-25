import java.util.ArrayList;
import java.util.List;

public class Pedido extends AbstractModel {
    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private double total;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void adicionarItem(ItemCardapio item, int quantidade) {
        itens.add(new ItemPedido(item, quantidade));
        calcularTotal();
    }

    public double calcularTotal() {
        total = itens.stream().mapToDouble(ItemPedido::getSubtotal).sum();
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
