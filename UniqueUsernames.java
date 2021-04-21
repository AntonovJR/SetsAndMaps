import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> hash = new LinkedHashSet<String>();
        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            hash.add(name);
        }
        for (String s : hash) {
            System.out.println(s);

        }
    }
}
