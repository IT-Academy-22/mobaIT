package game_classes;

import java.util.Arrays;

public class Sorcerer extends CharacterClass {

    public Sorcerer(String name) {
        super();

        setName(name);
        setMaxHp(1200);
        setBaseAttack(400); 
        setBaseDefense(100); 
        setResource(300); 
        setSpeed(80); 

        // setSkills(Arrays.asList("Bola de Fogo", "Teleporte", "Barreira Arcana"));
        // setWeapons(Arrays.asList("Cajado Arcano", "Livro de Magias"));
    }
}
