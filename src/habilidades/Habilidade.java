package habilidades;

enum TipoDoCusto    {
    MANA, HP;
}

public class Habilidade {
    private String nome;
    private String descricao;
    private TipoDoCusto tipoCusto;
    private int custo;
}
