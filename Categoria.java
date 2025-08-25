import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private List<ItemCardapio> itens;

    public Categoria(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public List<ItemCardapio> listarItens() {
        return itens;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
