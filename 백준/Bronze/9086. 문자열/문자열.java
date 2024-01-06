import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        String[] arr = new String[t];

        for(int i = 0; i < t; i++) {
            arr[i] = bufferedReader.readLine();
            System.out.print(arr[i].charAt(0));
            System.out.println(arr[i].charAt(arr[i].length() - 1));

        }



    }
}