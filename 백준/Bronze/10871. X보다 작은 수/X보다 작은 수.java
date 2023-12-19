import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] scale = bufferedReader.readLine().split(" ");

        String[] input = bufferedReader.readLine().split(" ");
        int[] arr  = new int[Integer.parseInt(scale[0])];;

        for(int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < Integer.parseInt(scale[1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
