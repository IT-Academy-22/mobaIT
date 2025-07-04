package game_classes;

import skills.ResourceType;
import weapon.PreMadeWeapons;
import weapon.Weapon;

import java.util.List;

public abstract class Role {

    protected String name;
    protected int HP;
    protected int attack;
    protected int defense;
    protected int resource;
    protected ResourceType resourceType;
    protected int speed;
    protected List<Weapon> weapons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }


    public Role() {
        this.weapons = new PreMadeWeapons().getWeapons();
    }

    public void displayStatus() {
        System.out.println("Classe: " + name);
        System.out.println("Vida: " + HP);
        System.out.println("Dano Base: " + attack);
        System.out.println("Defesa Base: " + defense);
        System.out.println("Recurso: " + resourceType);
        System.out.println("Armas: " + weapons);

    }
}
