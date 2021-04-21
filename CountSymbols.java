import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> chars = new TreeMap<>();
        String input = scanner.nextLine();
        for (int i = 0; i < input.length() ; i++) {
            char a = input.charAt(i);
            chars.putIfAbsent(a,0);
            int value = chars.get(a)+1;
            chars.put(a,value);
        }
        for (Character character : chars.keySet()) {
            System.out.printf("%s: %d time/s%n", character, chars.get(character));

        }
    }
}
