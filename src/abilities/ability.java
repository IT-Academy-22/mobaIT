package abilities;

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

    public List<Ability> hunterAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Hunter's Mark", "Marks an enemy, increasing damage dealt to it by 25% for 30 seconds", 15, costType.MANA));
        abilities.add(new Ability("Trap", "Places a concealed trap that deals damage and slows enemies by 50% for 5 seconds", 20, costType.MANA));
        abilities.add(new Ability("Summon Pet :3", "Summons a loyal companion that fights alongside you for 60 seconds", 35, costType.MANA));
        abilities.add(new Ability("Flame Arrow", "Shoots a burning arrow that deals fire damage over time for 8 seconds", 25, costType.MANA));
        return abilities;
    }
    
    public List<Ability> assassinAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Stealth", "Become invisible for 10 seconds, increasing next attack damage by 100%", 20, costType.MANA));
        abilities.add(new Ability("Backstab", "Strike from behind dealing 300% weapon damage, must be behind target", 15, costType.MANA));
        abilities.add(new Ability("Bleed", "Inflicts a bleeding wound that deals damage over 12 seconds", 12, costType.HP));
        abilities.add(new Ability("Poison", "Coats weapons with poison, causing attacks to deal poison damage for 20 seconds", 18, costType.MANA));
        return abilities;
    }
    
    public List<Ability> tankAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Guardian's Pace", "Reduces damage taken by 40% and reflects 20% back to attackers for 15 seconds", 25, costType.MANA));
        abilities.add(new Ability("Maximum Defense", "Becomes immobile but immune to all damage for 5 seconds", 30, costType.MANA));
        abilities.add(new Ability("Shield Bash", "Stuns target for 3 seconds and deals moderate damage", 20, costType.MANA));
        abilities.add(new Ability("Desenfer's Oath", "Sacrifices 25% current health to gain 50% damage reduction for 20 seconds", 0, costType.HP));
        return abilities;
    }
    
    public List<Ability> supportAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Heal", "Restores 40% of target's maximum health instantly", 30, costType.MANA));
        abilities.add(new Ability("Magic Shield", "Creates a barrier that absorbs 200 damage for 30 seconds", 25, costType.MANA));
        abilities.add(new Ability("Encourage", "Boosts all party members' damage by 30% for 45 seconds", 40, costType.MANA));
        abilities.add(new Ability("Speed Boost", "Increases movement and attack speed by 50% for 20 seconds", 20, costType.MANA));
        return abilities;
    }
    
    public List<Ability> mageAbilities(){
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("FIRE BALL!!!", "Hurls a massive fireball dealing high damage in a large area", 40, costType.MANA));
        abilities.add(new Ability("Lightning Chains", "Strikes target with lightning that jumps to 3 nearby enemies", 35, costType.MANA));
        abilities.add(new Ability("Summon Roots", "Entangles all enemies in area, dealing damage and immobilizing for 8 seconds", 30, costType.MANA));
        abilities.add(new Ability("Polymorph", "Transforms enemy into a harmless creature for 10 seconds", 25, costType.MANA));
        return abilities;
    }
}

