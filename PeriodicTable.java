import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> table = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            table.addAll(Arrays.asList(tokens));
        }
        for (String s : table) {
            System.out.print(s+" ");

        }
    }
}
