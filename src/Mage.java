public class Mage extends Character implements Attacker {
    public Mage(String name, int level) {
        super(name, level);
    }

    @Override
    public double attack() {
        return getIntelligence() * 3;
    }
}
