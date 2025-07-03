package weapon;

import java.util.List;

public class Weapon{
    protected String name;
    protected WeaponType type;
    protected int damage;
    protected List<Role> role;
    
    public Weapon(String name, WeaponType type, int damage){
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }
    public WeaponType getWeaponType(){
        return this.getWeaponType();
    }
    public int getDamage(){
        return this.damage;    
    }
    public List<Role> getRole(){
        return this.role;
    }
}