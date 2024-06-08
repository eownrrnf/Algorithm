import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long input = Integer.parseInt(bufferedReader.readLine());

        long result = 4;

        result *= input;

        System.out.println(result);

    }
}