package game_classes;

import skills.ResourceType;
import weapon.PreMadeWeapons;

import java.util.Arrays;

public class Tank extends Role {

    public Tank(String name) {
        super(); 

        setName(name);
        setHP(2000);
        setAttack(150);
        setDefense(200);
        setResourceType(ResourceType.MANA);
        setResource(500);
        setSpeed(50);
        setWeapons(new PreMadeWeapons().getWeapons());

        // setSkills(Arrays.asList("Provocar", "Barreira de Ferro", "Carga Blindada"));
        // setWeapons(Arrays.asList("Martelo Pesado", "Escudo Torre"));
    }
}
