public class  Main {
    public static void main(String[] args) {
        System.out.println("=== GAME CHARACTERS ===");

        Warrior warrior = new Warrior("Thor", 100, 25);
        Mage mage = new Mage("Merlin", 80, 30);
        Archer archer = new Archer("Robin", 90, 20);

        System.out.println("\n--- Starting Information ---");

        warrior.displayInfo();
        System.out.println();

        mage.displayInfo();
        System.out.println();

        archer.displayInfo();

        System.out.println("\n--- Battle Begins ---");

        warrior.attack(mage);
        mage.attack(warrior);
        archer.attack(warrior);

        System.out.println("\n--- Updated Health ---");

        System.out.println(warrior.getName() + "health: "
        + warrior.getHealth());

        System.out.println(mage.getName() + "health: "
        + mage.getHealth());

        System.out.println(archer.getName() + "health: "
        +archer.getHealth());

        System.out.println("\n--- Testing Exceptions ---");

        // Test invalid health
        try {
            Warrior invalidWarrior = new Warrior("Invalid", -10, 20);
        } catch (IllegalArgumentException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test negative damage
        try {
            archer.takeDamage(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Defeat a character
        try {
            warrior.takeDamage(1000);

            System.out.println(warrior.getName() + "health: "
            + warrior.getHealth());

            // Defeated character tries to attack
            warrior.attack(mage);

        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Try attacked a defeated character
        try {
            mage.attack(warrior);
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n=== GAME OVER ===");

    }
}