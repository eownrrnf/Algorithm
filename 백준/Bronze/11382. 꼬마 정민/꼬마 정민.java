import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        String[] aSplit = a.split(" ");

        long b = 0;

        for(int i=0; i < aSplit.length; i++) {
            b = b + Long.parseLong(aSplit[i]);
        }

        System.out.println(b);


        scanner.close();
    }
}