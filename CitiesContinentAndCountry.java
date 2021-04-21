import java.util.*;

public class CitiesContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, List<String>>> dataBase = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            dataBase.putIfAbsent(continent, new LinkedHashMap<>());
            dataBase.get(continent).putIfAbsent(country, new ArrayList<>());
            dataBase.get(continent).get(country).add(city);

        }

        dataBase.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((innerKey, innerValue) -> {
                System.out.println(" " + innerKey + " -> "
                        + String.join(", ", innerValue)
                );
            });
        });
    }
}
