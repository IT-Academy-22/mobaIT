package weapon;

import java.util.List;

public class PreMadeWeapons {
    List<Weapon> weapons;
    public PreMadeWeapons(){
        weapons.add(new Weapon("King's Sword", WeaponType.ShortRange, 55));
        weapons.add(new Weapon("Super Bow", WeaponType.LongRange, 50));
        weapons.add(new Weapon("Death Dagger", WeaponType.Meele, 30));
        weapons.add(new Weapon("Horned Shield", WeaponType.Meele,30));
        weapons.add(new Weapon("Regular Staff", WeaponType.ShortRange, 60));
        weapons.add(new Weapon("Six-Shooter", WeaponType.LongRange, 30));
        weapons.add(new Weapon("Axe", WeaponType.ShortRange, 65));
    }
}
