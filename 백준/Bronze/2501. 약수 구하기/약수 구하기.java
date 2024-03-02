import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       String[] inputs = bufferedReader.readLine().split(" ");

        int[] nums = new int[2];

       nums[0] = Integer.parseInt(inputs[0]);
       nums[1] = Integer.parseInt(inputs[1]);

       int n = nums[0];
       int k = nums[1];

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

       System.out.println(factors[k - 1]);
    }
}