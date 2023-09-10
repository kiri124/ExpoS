public class MMORPGGame {
    public static void main(String[] args) {
        CharacterBuilder builder = new CharacterBuilder();
        Character character1 = builder
            .setAppearance("Human", "Armor", "Red")
            .setHealth(100)
            .setLevel(5)
            .build();

        Character character2 = builder
            .setAppearance("Orc", "Robe", "Green")
            .setHealth(80)
            .setLevel(3)
            .build();

        character1.displayInfo();
        character2.displayInfo();
    }
}