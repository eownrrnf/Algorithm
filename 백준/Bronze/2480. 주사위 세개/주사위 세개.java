
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String [] input = bufferedReader.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if(a == b && a == c) {
            System.out.println(10000 + a * 1000);
        }else if(a == b) {
            System.out.println(1000 + a * 100);
        }else if(a == c) {
            System.out.println(1000 + a * 100);
        }else if(b == c) {
            System.out.println(1000 + b * 100);
        }else {
            if(a > b && a > c) {
                System.out.println(a * 100);
            }else if (b > a && b > c) {
                System.out.println(b * 100);
            }else if (c > a && c > b) {
                System.out.println(c * 100);
            }
        }
    }
}