import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 0; i < 9; i++) {
            System.out.println(a + " * " + (i+1) + " = " + (a * (i + 1)));
        }
    }
}