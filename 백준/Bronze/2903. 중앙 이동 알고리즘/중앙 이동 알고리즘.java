import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        // 2 -> 3 -> 5 -> 9 -> 17 -> 33

        int init = 2;

        for(int i = 0; i < t; i++) {
            init += (init - 1);
        }

        System.out.println(init * init);

    }
}