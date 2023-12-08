import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String [] input = bufferedReader.readLine().split(" ");

        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if(h != 0) {
            if(m >= 45) {
                System.out.print(h+ " ");
                System.out.print(m - 45);
            } else {
                System.out.print((h-1)+ " ");
                System.out.print(m + 15 );
            }
        } else {
            if(m >= 45) {
                System.out.print(h + " ");
                System.out.print(m - 45);
            } else {
                System.out.print(23 + " ");
                System.out.print(m + 15);
            }
        }

    }
}