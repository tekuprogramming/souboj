public class Warrior extends Character implements Attacker {

    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public double attack() {
        return getStrength() * 3;
    }
}
