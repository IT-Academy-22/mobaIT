package game_classes;

import java.util.Arrays;

public class Assassin extends Role {

    public Assassin(String name) {
        super(); 

        setName(name);
        setMaxHp(1000);
        setBaseAttack(450); 
        setBaseDefense(100);
        setResource(150); 
        setSpeed(150); 
        setWeapons(Arrays.asList(super.weapons));

        // setSkills(Arrays.asList("Ataque Fantasma", "Crítico Mortal", "Desaparecer"));
        // setWeapons(Arrays.asList("Lâminas Gêmeas", "Shuriken"));
    }
}
