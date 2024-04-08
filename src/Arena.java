import java.util.Random;

public class Arena {
    private Character player;
    private Enemy enemy;

    public Arena(Character player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void fight() {
        Random random = new Random();
        boolean playerTurn = random.nextBoolean();

        while (player.isAlive() && enemy.isAlive()) {
            if (playerTurn) {
                double damage = calculateDamageToEnemy(player, enemy);
                enemy.takeDamage(damage);
                System.out.println(player.getName() + " attacks " + enemy.getName() + " and causes them to lose " + damage + " of their health.");
            } else {
                double damage = calculateDamageToCharacter(enemy, player);
                player.takeDamage(damage);
                System.out.println(enemy.getName() + " attacks " + player.getName() + " and causes them to lose " + damage + " of their health.");
            }
            playerTurn = !playerTurn;
        }

        if (player.isAlive()) {
            int experience = enemy.getLevel() * 10;
            player.gainExperience(experience);
            System.out.println(player.getName() + " won the fight and gets " + experience + " experience points.");
        }
    }

    public double calculateDamageToEnemy(Character attacker, Enemy defender) {
        double attackDamage;
        double defense;

        if (attacker instanceof Warrior) {
            attackDamage = ((Warrior) attacker).attack();
            defense = defender.defendAgainstWarrior();
        } else if (attacker instanceof Mage) {
            attackDamage = ((Mage) attacker).attack();
            defense = defender.defendAgainstMage();
        } else if (attacker instanceof Rogue) {
            attackDamage = ((Rogue) attacker).attack();
            defense = defender.defendAgainstRogue();
        } else {
            attackDamage = 0;
            defense = 0;
        }

        double damage = attackDamage - defense;
        return Math.max(0, damage);
    }

    public double calculateDamageToCharacter(Enemy attacker, Character defender) {
        double attackDamage = attacker.getAttackDamage();
        double defense = defender.getDefense();

        double damage = attackDamage - defense;
        return Math.max(0, damage);
    }
}
