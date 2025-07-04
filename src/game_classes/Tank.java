package game_classes;

import java.util.Arrays;

public class Tank extends Role {

    public Tank(String name) {
        super(); 

        setName(name);
        setMaxHp(3000);
        setBaseAttack(150);
        setBaseDefense(500);
        setResource(100);
        setSpeed(50);
        setWeapons(Arrays.asList(new PreMadeWeapons().getWeapons()));

        // setSkills(Arrays.asList("Provocar", "Barreira de Ferro", "Carga Blindada"));
        // setWeapons(Arrays.asList("Martelo Pesado", "Escudo Torre"));
    }
}
