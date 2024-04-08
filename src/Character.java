public class Character {
    private String name;
    private int level;
    private double strength;
    private double intelligence;
    private double agility;
    private double resilience;
    private int experience;
    private int health;
    private double defense;

    public Character(String name, int level, double defense) {
        this.name = name;
        this.level = level;
        this.strength = 5;
        this.intelligence = 5;
        this.agility = 5;
        this.resilience = 5;
        this.experience = 0;
        this.health = level * 100;
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void gainExperience(int experience) {
        this.experience += experience;
    }

    public void modifyStrength(double percentage) {
        this.strength *= (1 + percentage);
    }

    public void modifyIntelligence(double percentage) {
        this.intelligence *= (1 + percentage);
    }

    public void modifyAgility(double percentage) {
        this.agility *= (1 + percentage);
    }

    public void modifyResilience(double percentage) {
        this.resilience *= (1 + percentage);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public double getStrength() {
        return strength;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public double getAgility() {
        return agility;
    }

    public String getName() {
        return name;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void takeDamage(double damage) {
        health -= (int) damage;
        if (health < 0) {
            health = 0;
        }
    }
}
