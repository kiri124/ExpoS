class Character {
    private CharacterAppearance appearance;
    private int health;
    private int level;

    public Character(CharacterAppearance appearance, int health, int level) {
        this.appearance = appearance;
        this.health = health;
        this.level = level;
    }

    public void displayInfo() {
        System.out.println("Apariencia del personaje:");
        appearance.display();
        System.out.println("Salud: " + health);
        System.out.println("Nivel: " + level);
    }
}
