package weapon;

import java.util.List;

public class PreMadeWeapons {
    List<Weapon> weapons;
    
    public PreMadeWeapons(){
        weapons.add(new Sword("Espada do Rei",50 ));
        
    }
    public List<Weapon> getWeapons(){
        return this.weapons;
    }
}
