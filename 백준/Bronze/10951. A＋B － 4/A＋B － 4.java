import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String input = bufferedReader.readLine();

            if(input == null) {
                break;
            }

            String[] nums = input.split(" ");

            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            System.out.println(a + b);

        }

    }
}