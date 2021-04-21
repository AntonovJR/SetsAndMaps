import java.util.LinkedHashSet;
import java.util.Scanner;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer = extracted(scanner);
        LinkedHashSet<Integer> secondPlayer = extracted(scanner);
        int rounds = 50;
        while(rounds-- >0&&!firstPlayer.isEmpty()&& !secondPlayer.isEmpty()) {

            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);

            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {

                firstPlayer.add(firstNumber);

                firstPlayer.add(secondNumber);

            } else if (secondNumber > firstNumber) {
                secondPlayer.add(firstNumber);

                secondPlayer.add(secondNumber);

            }


        }

        if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else if (secondPlayer.size() < firstPlayer.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw");
        }
    }

    private static LinkedHashSet<Integer> extracted(Scanner scanner) {
        String[] num = scanner.nextLine().split(" ");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (String s : num) {
            linkedHashSet.add(Integer.parseInt(s));
        }
        return linkedHashSet;
    }
}
