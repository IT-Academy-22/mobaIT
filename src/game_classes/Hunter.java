package game_classes;

import java.util.Arrays;

public class Hunter extends Role {

    public Hunter(String name) {
        super(); 

        setName(name);
        setMaxHp(1800); 
        setBaseAttack(300); 
        setBaseDefense(200); 
        setResource(150); 
        setSpeed(120); 

        // setSkills(Arrays.asList("Tiro Preciso", "Armadilha de Urso", "Camuflagem"));
        // setWeapons(Arrays.asList("Arco Longo", "Adagas Leves"));
    }
}
