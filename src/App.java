import java.util.*;

public class App {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    static Scanner scanner = new Scanner(System.in);

    // Mock data for champions (replace with real data later)
    static Map<String, List<Champion>> championsByClass = new HashMap<>();

    public static void main(String[] args) {
        initializeChampions();
        displayLogo();
        String playerName = askPlayerName();

        String chosenClass = null;
        while (true) {
            chosenClass = chooseClass();
            if (chosenClass == null) { // went back to player name
                playerName = askPlayerName();
                continue;
            }
            String chosenChampion = chooseChampion(chosenClass);
            if (chosenChampion == null) continue; // went back to class selection

            // Confirm champion choice (no going back from here)
            System.out.println(ANSI_GREEN + "\nYou have selected the champion " + ANSI_CYAN + chosenChampion + ANSI_GREEN + " from the class " + ANSI_CYAN + chosenClass + "!" + ANSI_RESET);
            break;
        }

        System.out.println(ANSI_YELLOW + "\nPreparing to start the game..." + ANSI_RESET);
        // Next steps in the game here...
    }

    public static void initializeChampions() {
        championsByClass.put("Mage", Arrays.asList(
                new Champion("Kael", "Mage", 500, 300, "Mana", 55, 35,  30, "Human", Arrays.asList("Fireball", "Frost Nova", "Arcane Blast")),
                new Champion("Yumi", "Mage", 480, 350, "Mana", 50, 35,  28, "Elf", Arrays.asList("Illusion", "Mirror Image", "Mana Drain"))
        ));
        championsByClass.put("Tank", Arrays.asList(
                new Champion("Gruk", "Tank", 800, 0, "Stamina", 40, 35,  60, "Orc", Arrays.asList("Shield Slam", "Taunt", "Fortify"))
        ));
        championsByClass.put("Hunter", Arrays.asList(
                new Champion("Lira", "Hunter", 550, 200, "Energy", 60, 35, 100, "Human", Arrays.asList("Arrow Shot", "Trap", "Eagle Eye"))
        ));
        championsByClass.put("Support", Arrays.asList(
                new Champion("Elyra", "Support", 450, 400, "Mana", 35, 35,  25, "Elf", Arrays.asList("Heal", "Protective Shield", "Revive"))
        ));
        championsByClass.put("Assassin", Arrays.asList(
                new Champion("Voltan", "Assassin", 600, 100, "Energy", 70, 35,  20, "Human", Arrays.asList("Backstab", "Smoke Bomb", "Poison Blade"))
        ));
    }

    public static void displayLogo() {
        System.out.println(ANSI_GREEN +
                "╔═════════════════════════════════════════════╗\n" +
                "║                                             ║\n" +
                "║   ███╗  ███╗ ██████╗ ██████╗  ██╗████████╗  ║\n" +
                "║   ████╗ ████║██╔═══██╗██╔══██╗██║╚══██╔══╝  ║\n" +
                "║   ██╔████╔██║██║   ██║██║██ ║ ██║   ██║     ║\n" +
                "║   ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║     ║\n" +
                "║   ██║ ╚═╝ ██║╚██████╔╝██████╔╝██║   ██║     ║\n" +
                "║   ╚═╝     ╚═╝ ╚═════╝ ╚═════╝ ╚═╝   ╚═╝     ║\n" +
                "║                                             ║\n" +
                "║          " + ANSI_CYAN + "MobIT - MOBA IT Academy #22" + ANSI_GREEN + "        ║\n" +
                "║                                             ║\n" +
                "╚═════════════════════════════════════════════╝\n" + ANSI_RESET);
    }

    public static String askPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║           Username creation        ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.print ("║ Username: ");
        String nick = scanner.nextLine();
        System.out.println("╚════════════════════════════════════╝");
        return nick.trim();
    }

    // Returns null if player chooses to go back (option 0)
    public static String chooseClass() {
        String[] classes = { "Mage", "Tank", "Hunter", "Support", "Assassin" };

        while (true) {
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("║           CHOOSE YOUR CLASS        ║");
            System.out.println("╠════════════════════════════════════╣");
            for (int i = 0; i < classes.length; i++) {
                System.out.printf("║ %d. %s%n", i + 1, classes[i]);
            }
            System.out.println("║ 0. Go back (change player name)    ");
            System.out.println("╚════════════════════════════════════╝");
            System.out.print(ANSI_CYAN + "\nEnter the number of your desired class: " + ANSI_RESET);

            String input = scanner.nextLine().trim();
            if (input.equals("0")) return null; // go back to player name

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= classes.length) {
                    return classes[choice - 1];
                }
            } catch (NumberFormatException e) {
                // ignore
            }
            System.out.println(ANSI_RED + "Invalid choice, please try again." + ANSI_RESET);
        }
    }

    // Returns null if player chooses to go back to class selection
    public static String chooseChampion(String className) {
        List<Champion> champions = championsByClass.get(className);
        if (champions == null || champions.isEmpty()) {
            System.out.println(ANSI_RED + "No champions available for this class." + ANSI_RESET);
            return null;
        }

        while (true) {
            System.out.println("\n╔════════════════════════════════════════════╗");
            System.out.printf("║        CHAMPIONS IN CLASS: %-28s%n", className);
            System.out.println("╠════════════════════════════════════════════╣");

            for (int i = 0; i < champions.size(); i++) {
                System.out.printf("║ %d. %-35s%n", i + 1, champions.get(i).name);
            }
            System.out.println("║ 0. Go back to class selection             ");
            System.out.println("╚════════════════════════════════════════════╝");
            System.out.print(ANSI_CYAN + "\nEnter the number of the champion you want: " + ANSI_RESET);

            String input = scanner.nextLine().trim();
            if (input.equals("0")) return null; // go back to class selection

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= champions.size()) {
                    Champion selected = champions.get(choice - 1);
                    boolean confirmed = showChampionDetails(selected);
                    if (confirmed) {
                        return selected.name;
                    }
                    // if not confirmed, show champions list again
                }
            } catch (NumberFormatException e) {
                // ignore
            }
            System.out.println(ANSI_RED + "Invalid choice, please try again." + ANSI_RESET);
        }
    }

    // Shows champion details and asks to confirm or go back
    public static boolean showChampionDetails(Champion c) {
        while (true) {
            System.out.println("\n╔════════════════════════════════════════════════════════╗");
            System.out.printf("║ %-54s ║%n", "CHAMPION DETAILS");
            System.out.println("╠════════════════════════════════════════════════════════╣");
            System.out.printf("║ Name: %-45s %n", c.name);
            System.out.printf("║ Class: %-42s %n", c.championClass);
            System.out.printf("║ Race: %-44s %n", c.race);
            System.out.printf("║ HP: %-46d %n", c.hp);
            System.out.printf("║ Resource: %-38d (%s) %n", c.resource, c.resourceType);
            System.out.printf("║ Base Attack: %-36d %n", c.baseAttack);
            System.out.printf("║ Speed: %-44d %n", c.speed);
            System.out.printf("║ Defense: %-42d %n", c.defense);
            System.out.println("║ Skills:                                               ");
            for (String skill : c.skills) {
                System.out.printf("║  - %-48s %n", skill);
            }
            System.out.println("╠════════════════════════════════════════════════════════╣");
            System.out.println("║ 1. Confirm champion                                    ║");
            System.out.println("║ 0. Go back to champions list                           ║");
            System.out.println("╚════════════════════════════════════════════════════════╝");
            System.out.print(ANSI_CYAN + "\nYour choice: " + ANSI_RESET);

            String input = scanner.nextLine().trim();
            if (input.equals("1")) {
                return true;
            } else if (input.equals("0")) {
                return false;
            } else {
                System.out.println(ANSI_RED + "Invalid option, please try again." + ANSI_RESET);
            }
        }
    }

    // Champion data structure
    static class Champion {
        String name, championClass, resourceType, race;
        int hp, resource, baseAttack, speed, defense;
        List<String> skills;

        public Champion(String name, String championClass, int hp, int resource, String resourceType, int baseAttack, int speed, int defense, String race, List<String> skills) {
            this.name = name;
            this.championClass = championClass;
            this.hp = hp;
            this.resource = resource;
            this.resourceType = resourceType;
            this.baseAttack = baseAttack;
            this.speed = speed;
            this.defense = defense;
            this.race = race;
            this.skills = skills;
        }
    }
}
