package game_classes;

import java.util.List;

public abstract class CharacterClass {

    protected String name;
    protected int maxHp;
    protected int baseAttack;
    protected int baseDefense;
    protected int resource;
    protected int speed;
    protected List<String> skills;
    protected List<String> weapons;
    
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getMaxHp() {
        return maxHp;
    }



    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }



    public int getBaseAttack() {
        return baseAttack;
    }



    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }



    public int getBaseDefense() {
        return baseDefense;
    }



    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }



    public int getResource() {
        return resource;
    }



    public void setResource(int resource) {
        this.resource = resource;
    }



    public int getSpeed() {
        return speed;
    }



    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public List<String> getSkills() {
        return skills;
    }



    public void setSkills(List<String> skills) {
        this.skills = skills;
    }



    public List<String> getWeapons() {
        return weapons;
    }



    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }



    public CharacterClass(String name, int maxHp, int baseAttack, int baseDefense,
            int resource, List<String> skills, List<String> weapons) {
        this.name = name;
        this.maxHp = maxHp;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.resource = resource;
        this.skills = skills;
        this.weapons = weapons;
    }

    public void displayStatus() {
        System.out.println("Classe: " + name);
        System.out.println("Vida: " + maxHp);
        System.out.println("Dano Base: " + baseAttack);
        System.out.println("Defesa Base: " + baseDefense);
        System.out.println("Recurso: " + resource);
        System.out.println("Habilidades: " + skills);
        System.out.println("Armas: " + weapons);
 
   }
}
