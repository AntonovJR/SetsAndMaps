import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> data = new LinkedHashMap<>();
        String input = scanner.nextLine();
        String name = "";
        int quantity = 0;
        for (int i = 1; i < 999 + 2; i++) {

            if (input.equals("stop")) {
                break;
            }
            if (i % 2 == 0) {
                quantity += Integer.parseInt(input);

            } else {
                name = input;
            }
            data.putIfAbsent(name, quantity);
            int value = data.get(name);
            quantity+=value;
            data.put(name, quantity);
            quantity = 0;
            input = scanner.nextLine();
        }
        for (String s : data.keySet()) {
            System.out.printf("%s -> %d%n",s, data.get(s));

        }
    }
}
