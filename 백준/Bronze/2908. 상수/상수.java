import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] arr = bufferedReader.readLine().split(" ");

        int[] nums = new int[2];

        for(int i = 0; i < 2; i++) {
             int units = arr[i].charAt(0) - '0';
             int tens = arr[i].charAt(1) - '0';
             int hunds = arr[i].charAt(2) - '0';

             nums[i] = units + (tens * 10) + (hunds * 100);
        }

        if(nums[0] > nums[1]) {
            System.out.println(nums[0]);
        }else {
            System.out.println(nums[1]);
        }

    }
}