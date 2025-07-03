package habilities;

import java.util.ArrayList;
import java.util.List;

enum costType {
    MANA,
    HP;
}

public class Ability {
    private String name;
    private String description;
    private int cost;
    private costType type;

    public Ability(String name, String description, int cost, costType type) {
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

    public List<Ability> hunterHabilities(){
        List<Ability> habilities = new ArrayList<>();
        habilities.add(new Ability("Hunter's Mark", "", 10, costType.MANA));
        habilities.add(new Ability("Trap", "", 15, costType.MANA));
        habilities.add(new Ability("Summon Pet :3", "", 20, costType.MANA));
        habilities.add(new Ability("Flame Arrow", "", 20, costType.MANA));
        return habilities;
    }

    public List<Ability> assassinAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Stealth", "", 10, costType.MANA));
        abilities.add(new Ability("Stealth", "", 10, costType.MANA));
    }
}
