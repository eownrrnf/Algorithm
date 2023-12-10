
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());



        int [][] nums = new int[t][2];

        for(int i = 0; i < t; i++) {

            String[] input = bufferedReader.readLine().split(" ");

            nums[i][0] = Integer.parseInt(input[0]);
            nums[i][1] = Integer.parseInt(input[1]);

        }

        for(int i = 0; i < t; i++) {

            System.out.println(nums[i][0] + nums[i][1]);

        }

    }
}