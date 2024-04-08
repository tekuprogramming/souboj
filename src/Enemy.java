import java.util.Random;

public class Enemy {
    private String name;
    private int level;
    private int health;
    private double strength;
    private double intelligence;
    private double agility;
    private double resilience;
    private double attackDamage;

    public Enemy(String name, int level, double attackDamage) {
        this.name = name;
        this.level = level;
        this.health = level * 100;
        Random random = new Random();
        this.strength = random.nextDouble() * 10;
        this.intelligence = random.nextDouble() * 10;
        this.agility = random.nextDouble() * 10;
        this.resilience = random.nextDouble() * 10;
        this.attackDamage = attackDamage;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(double damage) {
        health -= (int) damage;
        if (health < 0) {
            health = 0;
        }
    }

    public double attackWarrior() {
        return strength * 3;
    }

    public double attackMage() {
        return intelligence * 3;
    }

    public double attackRogue() {
        return agility * 3;
    }

    public double defendAgainstWarrior() {
        return strength + resilience;
    }

    public double defendAgainstMage() {
        return intelligence + resilience;
    }

    public double defendAgainstRogue() {
        return agility + resilience;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }
}
