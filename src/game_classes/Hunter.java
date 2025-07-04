package game_classes;

import skills.ResourceType;

public class Hunter extends Role {

    public Hunter(String name) {
        super(); 

        setName(name);
        setHP(1800);
        setAttack(300);
        setDefense(200);
        setResourceType(ResourceType.MANA);
        setResource(500);
        setSpeed(120); 

        // setSkills(Arrays.asList("Tiro Preciso", "Armadilha de Urso", "Camuflagem"));
        // setWeapons(Arrays.asList("Arco Longo", "Adagas Leves"));
    }
}
