class CharacterBuilder {
    private CharacterAppearance appearance;
    private int health;
    private int level;

    public CharacterBuilder setAppearance(String model, String clothes, String color) {
        this.appearance = AppearanceFactory.getCharacterAppearance(model, clothes, color);
        return this;
    }

    public CharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public CharacterBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public Character build() {
        return new Character(appearance, health, level);
    }
}