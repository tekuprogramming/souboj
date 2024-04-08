public class Rogue extends Character implements Attacker {
    public Rogue(String name, int level) {
        super(name, level);
    }

    @Override
    public double attack() {
        return getAgility() * 3;
    }
}
