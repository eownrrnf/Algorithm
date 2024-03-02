import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if(n == -1) break;

            int[] factors = new int[n];

            for(int i = 1; i < n + 1; i++) {
                if(n % i == 0) {
                    for(int j = 0; j < n; j++) {
                        if(factors[j] == 0) {
                            factors[j] =  i;
                            break;
                        }
                    }
                }
            }

            int sum = 0;
            for(int i = 0; i < n; i++) {
                if(factors[i] != 0) sum += factors[i];
            }

            if(n == sum - n) {
                System.out.print(n + " ");
                for(int i = 0; i < n; i++) {
                    if(factors[i] != 0 && factors[i] != n) {
                        if(factors[i] == 1) System.out.print("= 1");
                        else System.out.print(" + " + factors[i]);
                    }
                }
                System.out.println();
            } else System.out.println(n + " is NOT perfect.");
        }
    }
}