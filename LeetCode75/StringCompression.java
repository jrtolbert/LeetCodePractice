import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static int compress(char[] characterArr) {
        if (characterArr.length == 1) {
            return 1;
        }

        StringBuilder empty = new StringBuilder();
        Map<Character, Integer> container = new HashMap<>();

        for (int i = 0; i < characterArr.length; i++) {
            Character character = characterArr[i];
            if (container.containsKey(characterArr[i])) {
                int keyVal = container.get(character);
                container.put(character, keyVal + 1);
            } else {
                container.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> val : container.entrySet()) {
            if (val.getValue() == 1)
                empty.append(val.getKey());
            else
                empty.append(val.getKey()).append(val.getValue());
        }
        return empty.length();
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(arr));
    }
}