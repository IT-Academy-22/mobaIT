package game_classes;

import skills.ResourceType;

import java.util.Arrays;

public class Assassin extends Role {

    public Assassin(String name) {
        super(); 

        setName(name);
        setHP(1000);
        setAttack(450);
        setDefense(100);
        setResourceType(ResourceType.ENERGY);
        setResource(300);
        setSpeed(150); 
        setWeapons(super.weapons);

        // setSkills(Arrays.asList("Ataque Fantasma", "Crítico Mortal", "Desaparecer"));
        // setWeapons(Arrays.asList("Lâminas Gêmeas", "Shuriken"));
    }
}
