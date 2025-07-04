package game_classes;

import skills.ResourceType;

public class Sorcerer extends Role {

    public Sorcerer(String name) {
        super();

        setName(name);
        setHP(600);
        setAttack(400);
        setDefense(100);
        setResourceType(ResourceType.MANA);
        setResource(1000);
        setSpeed(80); 

        // setSkills(Arrays.asList("Bola de Fogo", "Teleporte", "Barreira Arcana"));
        // setWeapons(Arrays.asList("Cajado Arcano", "Livro de Magias"));
    }
}
