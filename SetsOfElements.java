
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstSetSize = Integer.parseInt(input.split(" ")[0]);
        int secondSetSize = Integer.parseInt(input.split(" ")[1]);
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>(firstSetSize);
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>(secondSetSize);
        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));

        }
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));

        }
        firstSet.retainAll(secondSet);
        for (Integer integer : firstSet) {
            System.out.print(integer+" ");

        }
    }
}
