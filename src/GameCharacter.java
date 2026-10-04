public class GameCharacter {
    private String name;
    private int health;
    private int attackPower;

    public GameCharacter(String name, int health, int attackPower){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Character name cannot be blank.");
        }

        if (health <= 0) {
            throw new IllegalArgumentException("Starting health must be greater than zero.");
        }

        if (attackPower <= 0) {
            throw new IllegalArgumentException("Attack power must be greater than zero.");
        }

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }

        health -= damage;

        if (health <0) {
            health = 0;
        }
    }

    public void attack(GameCharacter target) {
        if (!this.isAlive()) {
            throw new IllegalStateException(
                    target.getName() + "is already defeated and cannot be attacked."
            );
        }

        System.out.println(name + "attacks" + target.getName() + "!");

        target.takeDamage(attackPower);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Alive: " + isAlive());
    }
}