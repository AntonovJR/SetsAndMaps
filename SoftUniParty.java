import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> VIP = new TreeSet<String>();
        Set<String> normal = new TreeSet<String>();
        String input = scanner.nextLine();
        while (!"PARTY".equals(input)) {
            if(Character.isDigit(input.charAt(0))){
                VIP.add(input);
            }else{
                normal.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!"END".equals(input)) {
            if(Character.isDigit(input.charAt(0))){
                VIP.remove(input);
            }else{
                normal.remove(input);
            }
            input = scanner.nextLine();
        }
        System.out.println(VIP.size()+normal.size());
        for (String s : VIP) {
            System.out.println(s);
        }
        for (String s : normal) {
            System.out.println(s);

        }
    }
}
