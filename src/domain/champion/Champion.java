package domain.champion;

import skills.Skill;

import java.util.List;

public class Champion {
    private final String name;
    private final List<Skill> skill;
    private int HP;
    private int resource;
    private ResourceType resourceType;
    private int attack;
    private int defense;
    private int speed;
    private final Race race;
    private final Role role;
    private Weapon weapon = null;

    public Champion(String name, List<Skill> skill, int HP, int resource, ResourceType resourceType, int attack, int defense,int speed, Race race, Role role) {
        this.name = name;
        this.skill = skill;
        this.HP = HP + role.HP;
        this.resource = role.resourceType.equals("HP") ? this.HP : resource + role.resource;
        this.attack = attack + role.attack;
        this.defense = defense + role.defense;
        this.speed = speed + role.speed;
        this.race = race;
        this.role = role;
        this.resourceType = role.resourceType;
    }

    private void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }


    public Skill[] getSkill() {
        return this.skill;
    }


    public int getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getResource() {
        return this.resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Race getRace() {
        return this.race;
    }


    public Role getRole() {
        return this.role;
    }


    public Weapon getWeapon() {
        return this.weapon;
    }

}
