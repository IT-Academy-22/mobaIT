package abilities;

import java.util.ArrayList;
import java.util.List;

enum costType {
    MANA,
    HP;
}

public class ability {
    private String name;
    private String description;
    private int cost;
    private costType type;

    public ability(String name, String description, int cost, costType type) {
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

    public List<ability> hunterHabilities(){
        List<ability> habilities = new ArrayList<>();
        habilities.add(new ability("Hunter's Mark", "", 10, costType.MANA));
        habilities.add(new ability("Trap", "", 15, costType.MANA));
        habilities.add(new ability("Summon Pet :3", "", 20, costType.MANA));
        habilities.add(new ability("Flame Arrow", "", 20, costType.MANA));
        return habilities;
    }
}
