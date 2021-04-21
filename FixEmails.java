import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new LinkedHashMap<>();
        String input = scanner.nextLine();
        String name = "";
        String email = "";
        for (int i = 1; i < 999 + 2; i++) {

            if (input.equals("stop")) {
                break;
            }
            if (i % 2 == 0) {
                email = input;
                if(email.split("\\.")[1].equals("bg")) {
                    data.put(name, email);
                }

            } else {
                name = input;
            }

            input = scanner.nextLine();
        }
        for (String s : data.keySet()) {
            System.out.printf("%s -> %s%n",s, data.get(s));

        }
    }
}
