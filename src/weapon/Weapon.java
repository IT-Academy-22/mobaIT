package weapon;

public abstract class Weapon{
    protected String name;
    protected WeaponType type;
    protected int damage;
    protected List<Role> role;
    
    public Weapon(String name, WeaponType type, int damage){
        this.name = name;
        this.type = type;
        this.damage = damage;
    }
    
    public abstract void action();   
}