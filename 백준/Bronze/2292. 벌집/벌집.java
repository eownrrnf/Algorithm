import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        // 1 - 7 - 19 - 37 - 61
        //   6   12   18   24

        int init = 1;
        int turn = 6;
        int room = 1;

        while(true) {
            if(n == init) {
                break;
            }

            int temp = init;

            init += turn;

            turn += 6;

            room++;

            if(n > temp && n < init) {
                break;
            }
        }

        System.out.print(room);

    }
}