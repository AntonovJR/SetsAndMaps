import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> graduationList = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {

            String name = scanner.nextLine();
            String[] scoresStrings = scanner.nextLine().split(" ");
            List<Double> temp = new ArrayList<>();
            for (int j = 0; j < scoresStrings.length; j++) {
                temp.add(Double.parseDouble(scoresStrings[j]));

            }

            graduationList.put(name, temp);

        }
        graduationList.forEach((k,v)->{
            double average = 0;
            for (Double aDouble : v) {
                average += aDouble;
            }
            average/=v.size();

            System.out.printf("%s is graduated with %s%n", k, average);
        });

    }

}