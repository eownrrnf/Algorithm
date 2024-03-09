import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] nums = bufferedReader.readLine().split(" ");

        int check = 0;

        int result = 0;

        for (int i = 0; i < n; i++) {
            check = 0;
            int num = Integer.parseInt(nums[i]);
            for(int j = 1; j < num + 1; j++) {
                if(num % j == 0) check++;
            }

            if(check == 2) result++;
        }

        System.out.println(result);
    }
}