package weapon;


public class Sword extends Weapon{
    public Sword(String name){
        super(name, WeaponType.ShortRange, 25);
    }

    @Override
    public void action() {
        throw new UnsupportedOperationException("Unimplemented method 'action'");
    }
    
}
