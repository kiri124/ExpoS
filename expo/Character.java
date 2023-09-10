class Character {
    private String name;
    private String appearance;
    private int health;
    private int level;

    public Character(String name, String appearance, int health, int level) {
        this.name = name;
        this.appearance = appearance;
        this.health = health;
        this.level = level;
    }

    public void displayInfo() {
        System.out.println("Nombre del personaje: " + name);
        System.out.println("Apariencia del personaje: " + appearance);
        System.out.println("Salud: " + health);
        System.out.println("Nivel: " + level);
    }
}
