package habilidades;

enum costType    {
    MANA, HP;
}

public class Hability {
    private String name;
    private String description;
    private costType costType;
    private int cost;

    public Hability(String nome, String descricao, costType tipoCusto, int custo) {
        this.name = nome;
        this.description = descricao;
        this.costType = tipoCusto;
        this.cost = custo;
    }

    public String getNome() {
        return name;
    }

    public String getDescricao() {
        return description;
    }

    public costType getTipoCusto() {
        return costType;
    }

    public int getCusto() {
        return cost;
    }
}
