package game_classes;

import skills.ResourceType;

public class Support extends Role {

    public Support(String name) {
        super(); 

        setName(name);
        setHP(750);
        setAttack(100);
        setDefense(300);
        setResourceType(ResourceType.MANA);
        setResource(600);
        setSpeed(100);

        // setSkills(Arrays.asList("Cura em Área", "Escudo de Luz", "Benção da Vida"));
        // setWeapons(Arrays.asList("Cajado Sagrado", "Orbe da Harmonia"));
    }
}
