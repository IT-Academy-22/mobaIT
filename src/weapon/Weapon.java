package weapon;


public class Weapon{
    private String name;
    private WeaponType type;
    private int damage;
    
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
    
}