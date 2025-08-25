public class ItemCardapio {
    private String nome;
    private String descricao;
    private double preco;
    private String imagem;

    public ItemCardapio(String nome, String descricao, double preco, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getDetalhes() {
        return nome + " - " + descricao + " - R$ " + preco;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }
}
