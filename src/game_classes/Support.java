package game_classes;

import java.util.Arrays;

public class Support extends CharacterClass {

    public Support(String name) {
        super(); 

        setName(name);
        setMaxHp(2000); 
        setBaseAttack(100); 
        setBaseDefense(300);
        setResource(400); 
        setSpeed(100);

        // setSkills(Arrays.asList("Cura em Área", "Escudo de Luz", "Benção da Vida"));
        // setWeapons(Arrays.asList("Cajado Sagrado", "Orbe da Harmonia"));
    }
}
