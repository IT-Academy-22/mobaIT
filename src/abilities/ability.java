package abilities;

import java.util.ArrayList;
import java.util.List;

import habilities.Ability;

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

    public List<ability> hunterHabilities(){
        List<ability> habilities = new ArrayList<>();
        habilities.add(new ability("Hunter's Mark", "", 10, costType.MANA));
        habilities.add(new ability("Trap", "", 15, costType.MANA));
        habilities.add(new ability("Summon Pet :3", "", 20, costType.MANA));
        habilities.add(new ability("Flame Arrow", "", 20, costType.MANA));
        return habilities;
    }

    public List<Ability> assassinAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Stealth", "", 10, costType.MANA));
        abilities.add(new Ability("Backstab", "", 10, costType.MANA));
        abilities.add(new Ability("Bleed", "", 10, costType.MANA));
        abilities.add(new Ability("Poison", "", 10, costType.MANA));
    }

    public List<Ability> tankAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Guardian´s Pace", "", 10, costType.MANA));
        abilities.add(new Ability("Maximum Defense", "", 10, costType.MANA));
        abilities.add(new Ability("Shield Bash", "", 10, costType.MANA));
        abilities.add(new Ability("Desenfer´s Oath", "", 10, costType.MANA));
    }

    public List<Ability> supportAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Heal", "", 10, costType.MANA));
        abilities.add(new Ability("Magic Shield", "", 10, costType.MANA));
        abilities.add(new Ability("Encourage", "", 10, costType.MANA));
        abilities.add(new Ability("Speed Boost", "", 10, costType.MANA));
    }

    public List<Ability> mageAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("FIRE BALL!!!", "", 10, costType.MANA));
        abilities.add(new Ability("Lightning Chains", "", 10, costType.MANA));
        abilities.add(new Ability("Summon Roots", "", 10, costType.MANA));
        abilities.add(new Ability("Polymorth", "", 10, costType.MANA));
    }
    
}

