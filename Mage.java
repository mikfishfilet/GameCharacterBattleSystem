public class Mage extends GameCharacter {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(GameCharacter target) {
        if (!this.isAlive() {
            throw new IllegalStateExcpetion(
                    getName + "is defeated and cannot attack."
            );
        }

        if (!target.isAlive()) {
            throw new IllegalStateException(
                    target.getName() + " is already defeated and cannot be attacked"
            );
        }

        System.out.println(getName() + "casts a spell at "
        + target.getName() + "!");

        target.takeDamage(getAttackPower());
    }
}