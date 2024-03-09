import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        int check = 0;

        int sum = 0;
        int min = 0;

        for (int i = m; i < n + 1; i++) {
            check = 0;
            for(int j = 1; j < i + 1; j++) {
                if(i % j == 0) check++;
            }

            if(check == 2) {
                sum += i;
                if(min == 0 || min > i) min = i;
            }
        }

        if(sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}