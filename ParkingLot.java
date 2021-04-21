import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> hash = new LinkedHashSet<String>();
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] tokens = input.split(", ");
            switch (tokens[0]) {
                case "IN":
                    hash.add(tokens[1]);
                    break;
                case "OUT":
                    hash.remove(tokens[1]);
                    break;

            }
            input = scanner.nextLine();
        }
        if (hash.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : hash) {
                System.out.println(s);
            }
        }
    }
}
