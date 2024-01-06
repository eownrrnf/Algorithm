import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < n; i++) {
            String[] arr = bufferedReader.readLine().split(" ");

            int r = Integer.parseInt(arr[0]);
            String s = arr[1];

            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}