import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numbers = new LinkedHashMap<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(n -> {
                    numbers.putIfAbsent(n, 0);
                    numbers.put(n, numbers.get(n) + 1);

                });
        String output = numbers.entrySet()
                .stream()
                .map(entry -> String.format("%.1f -> %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);

    }
}

/* LinkedHashMap<Double,Integer> data = new LinkedHashMap<>();
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < input.length ; i++) {
            if(!data.containsKey(input[i])){
                data.put(input[i],1);
            }else{
                int value = data.get(input[i])+1;
                data.put(input[i],value);
            }

        }
        for (Double aDouble : data.keySet()) {
            int value = data.get(aDouble);
            System.out.println(data.get(aDouble)+" -> "+value);

        }
*/
