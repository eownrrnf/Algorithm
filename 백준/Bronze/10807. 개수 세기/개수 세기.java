
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] input = new String[n];
        int[] arr = new int[n];

        input = bufferedReader.readLine().split(" ");

        for(int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(input[i]);

        }

        int v = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);

    }
}