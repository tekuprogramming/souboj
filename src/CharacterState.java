public class CharacterState {
    private Character character;
    private ExperienceStrategy experienceStrategy;

    public CharacterState(Character character) {
        this.character = character;
        this.experienceStrategy = new BasicExperienceStrategy();
    }

    public void setExperienceStrategy(ExperienceStrategy experienceStrategy) {
        this.experienceStrategy = experienceStrategy;
    }

    public void gainExperience() {
        double experience = experienceStrategy.gainExperience();
        character.gainExperience(experience);
    }
}
