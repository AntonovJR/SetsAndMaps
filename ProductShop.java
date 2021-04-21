import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Double>> dataBase = new TreeMap<>();
        String input = scanner.nextLine();
        while(!"Revision".equals(input)){
            String[] tokens = input.split(", ");
            dataBase.putIfAbsent(tokens[0],new LinkedHashMap<>());
            dataBase.get(tokens[0]).put(tokens[1],Double.parseDouble(tokens[2]));

            input = scanner.nextLine();
        }
        dataBase.entrySet()
                .stream()
                .forEach(entry->{
                    System.out.println(entry.getKey()+"->");
                    entry.getValue().entrySet()
                            .stream()
                            .forEach(innerEntry->{
                                System.out.printf("Product: %s, Price: %.1f%n",
                                        innerEntry.getKey(),
                                        innerEntry.getValue());
                            });

                });
    }
}
