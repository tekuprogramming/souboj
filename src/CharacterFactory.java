public class CharacterFactory {
    public static Character createCharacter(String name, String race, String characterClass, int level) {
        Character character = new Character(name, level);
        return character;
    }

    public static void applyRaceBonuses(Character character, String race) {
        switch (race) {
            case "human":
                character.modifyStrength(0.03);
                character.modifyIntelligence(0.03);
                character.modifyAgility(0.04);
                break;
            case "elf":
                character.modifyIntelligence(0.06);
                character.modifyAgility(0.04);
                break;
            case "dwarf":
                character.modifyStrength(0.07);
                character.modifyAgility(0.03);
                break;
            case "troll":
                character.modifyStrength(0.1);
                break;
            case "dark elf":
                character.modifyIntelligence(0.04);
                character.modifyAgility(0.06);
                break;
            case "undead":
                character.modifyIntelligence(0.1);
                break;
        }
    }

    public static void applyClassBonuses(Character character, String characterClass) {
        switch (characterClass) {
            case "warrior":
                character.modifyStrength(0.03);
                break;
            case "wizard":
                character.modifyIntelligence(0.03);
                break;
            case "scout":
                character.modifyAgility(0.03);
                break;
        }
    }
}
