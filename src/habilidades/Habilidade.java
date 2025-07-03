package habilidades;

enum TipoDoCusto    {
    MANA, HP;
}

public class Habilidade {
    private String nome;
    private String descricao;
    private TipoDoCusto tipoCusto;
    private int custo;

    public Habilidade(String nome, String descricao, TipoDoCusto tipoCusto, int custo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoCusto = tipoCusto;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoDoCusto getTipoCusto() {
        return tipoCusto;
    }

    public int getCusto() {
        return custo;
    }
}
