public class Character {
    private String name;
    private int level;
    private double strength;
    private double intelligence;
    private double agility;
    private double resilience;
    private double experience;
    private int health;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.strength = 5;
        this.intelligence = 5;
        this.agility = 5;
        this.resilience = 5;
        this.experience = 0;
        this.health = level * 100;
    }

    public int getHealth() {
        return health;
    }

    public void gainExperience(double experience) {
        this.experience += experience;
    }
}
