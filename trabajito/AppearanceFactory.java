
import java.util.HashMap;
import java.util.Map;

class AppearanceFactory {
    private static Map<String, CharacterAppearance> appearanceCache = new HashMap<>();

    public static CharacterAppearance getCharacterAppearance(String model, String clothes, String color) {
        String key = model + "-" + clothes + "-" + color;
        if (!appearanceCache.containsKey(key)) {
            CharacterAppearance appearance = new CharacterAppearance(model, clothes, color);
            appearanceCache.put(key, appearance);
        }
        return appearanceCache.get(key);
    }
}