
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        
        int x = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        int [][] price = new int[n][2];

        for(int i = 0; i < n; i++) {

            String [] input = bufferedReader.readLine().split(" ");

            for(int j = 0; j < 2; j++) {
                price[i][j] = Integer.parseInt(input[j]);
            }

        }
        
        for(int i = 0; i < n; i++) {

            sum = sum + (price[i][0] * price[i][1]);

        }

        if(x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}