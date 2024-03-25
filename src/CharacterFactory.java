public class CharacterFactory {
    public static Character createCharacter(String name, String race, String characterClass, int level) {
        Character character = new Character(name, level);
        return character;
    }

    public static void applyRaceBonuses(Character character, String race) {
        switch (race) {
            case "human":

        }
    }
}
