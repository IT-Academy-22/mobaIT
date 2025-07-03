package Weapon;

public abstract class Weapon{
    private String name;
    private WeaponType type;
    private int demage;
    private List<Role> role;

    public abstract void action();
    
}