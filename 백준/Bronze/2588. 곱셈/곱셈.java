import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int c = Integer.parseInt(a);

        for(int i = b.length() - 1; i >= 0; i--) {
            System.out.println(c * Character.getNumericValue(b.charAt(i)));
        }

        int d = Integer.parseInt(b);

        System.out.println(c * d);



        scanner.close();
    }
}