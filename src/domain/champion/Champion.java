package domain.champion;

public class Champion {
    private final String name;
    private final Skill[] skill;
    private int HP;
    private int resource;
    private ResourceType resourceType;
    private int attack;
    private int defense;
    private int speed;
    private final Race race;
    private final Role role;
    private Weapon weapon = null;

    public Champion(String name, Skill[] skill, int HP, int resource, ResourceType resourceType, int attack, int defense, Race race, Role role) {
        this.name = name;
        this.skill = skill;
        this.HP = HP + role.HP;
        this.resource = role.resourceType.equals("HP") ? this.HP : resource + role.resource;
        this.attack = attack + role.attack;
        this.defense = defense + role.defense;
        this.race = race;
        this.role = role;
        this.resourceType = role.resourceType;
    }

    private void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }




}
