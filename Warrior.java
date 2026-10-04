public class Warrior extends GameCharacter {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(GameCharacter target) {
        if (!this.isAlive()) {
            throw new IllegalStateException(
                    getName() + "is defeated and cannot attack."
            );
        }

        if (!target.isAlive()) {
            throw new IllegalStateException(
                    target.getName() + "is already defeated and cannot be attacked."
            );
        }

        System.out.println(getName() + "attacks" + target.getName()
                + "with a sword!");

        target.takeDamage(getAttackPower());
    }
}