
public class MMORPGGame {
    public static void main(String[] args) {
        Character character1 = new Character("Personaje 1", "Humano con armadura roja", 100, 5);
        Character character2 = new Character("Personaje 2", "Orco con túnica verde", 80, 3);

        character1.displayInfo();
        character2.displayInfo();
    }
}