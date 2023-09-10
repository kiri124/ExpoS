import java.util.HashMap;
import java.util.Map;

class CharacterAppearance {
    private String model;
    private String clothes;
    private String color;

    public CharacterAppearance(String model, String clothes, String color) {
        this.model = model;
        this.clothes = clothes;
        this.color = color;
    }

    public void display() {
        System.out.println("Modelo: " + model + ", Ropa: " + clothes + ", Color: " + color);
    }
}