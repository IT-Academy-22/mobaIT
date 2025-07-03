package game_classes;

import java.util.Arrays;

public class Tank extends CharacterClass {

    public Tank(String name) {
        super(); 

        setName(name);
        setMaxHp(3000);
        setBaseAttack(150);
        setBaseDefense(500);
        setResource(100);
        setSpeed(50);
        // setSkills(Arrays.asList("Provocar", "Barreira de Ferro", "Carga Blindada"));
        // setWeapons(Arrays.asList("Martelo Pesado", "Escudo Torre"));
    }
}
