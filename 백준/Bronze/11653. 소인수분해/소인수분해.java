import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int i = 2;

        while(true) {

            if(n == 1) break;
            if(i == n) {
                System.out.println(i);
                break;
            }

            if(n % i == 0) {
                System.out.println(i);
                n /= i;
            }else {
                i++;
            }
        }
    }
}