package weapon;

import java.util.List;

public class PreMadeWeapons {
    private List<Weapon> weapons;
    public PreMadeWeapons(){
        weapons.add(new Weapon("King's Sword", WeaponType.ShortRange, 55));
        weapons.add(new Weapon("Super Bow", WeaponType.LongRange, 55));
        weapons.add(new Weapon("Death Dagger", WeaponType.Meele, 40));
        weapons.add(new Weapon("Horned Shield", WeaponType.Meele,25));
        weapons.add(new Weapon("Regular Staff", WeaponType.ShortRange, 60));
        weapons.add(new Weapon("Six-Shooter", WeaponType.LongRange, 35));
        weapons.add(new Weapon("Piercing Axe", WeaponType.ShortRange, 65));
        weapons.add(new Weapon("Sniper Slingshot", WeaponType.LongRange, 35));
        weapons.add(new Weapon("Hex Hands", WeaponType.LongRange, 30));
        weapons.add(new Weapon("Bonebreakers", WeaponType.Meele, 40));
        weapons.add(new Weapon("Thor Hammer", WeaponType.ShortRange, 65));
        weapons.add(new Weapon("Doom Bat", WeaponType.ShortRange, 60));
    }

    public List<Weapon> getWeapons(){
        return this.weapons;
    }
}
