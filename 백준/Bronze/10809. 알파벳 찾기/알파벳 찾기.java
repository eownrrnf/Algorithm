import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        for(int i = 97; i < 123; i++) {
            int index = -1;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == i) {
                    index = j;
                    break;
                }
            }

            System.out.print(index + " ");
        }

    }
}