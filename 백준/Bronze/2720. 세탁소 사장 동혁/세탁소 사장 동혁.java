import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < t; i++) {
            int c = Integer.parseInt(bufferedReader.readLine());

            int q = c / 25;

            c = c - (q * 25);

            int d = c / 10;

            c = c - (d * 10);

            int n = c / 5;

            c = c - (n * 5);

            int p = c / 1;

            System.out.println(q + " " + d + " " + n + " " + p);
        }

    }
}