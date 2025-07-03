package habilities;

enum costType {
    MANA,
    HP;
}

public class Hability {
    private String name;
    private String description;
    private int cost;
    private costType type;

    public Hability(String name, String description, int cost, costType type) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public costType getType() {
        return type;
    }
}
