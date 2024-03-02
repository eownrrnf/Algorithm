import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int [][] inputs = new int[10][2];

        int a, b;
        int i = 0;
        while (true) {
            String[] numbers = bufferedReader.readLine().split(" ");

            inputs[i][0] = Integer.parseInt(numbers[0]);
            inputs[i][1] = Integer.parseInt(numbers[1]);
            a = inputs[i][0];
            b = inputs[i][1];

            if(a == 0 && b == 0) break;

            i++;

            if(a < b && b % a == 0) System.out.println("factor");
            else if (a > b && a % b == 0) System.out.println("multiple");
            else System.out.println("neither");

        }
    }
}