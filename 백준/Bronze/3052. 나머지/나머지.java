import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //입력 개수
        int n = 10;

        int[] rests = new int[n];

        for(int i = 0; i < n; i++) {
            rests[i] = Integer.parseInt(bufferedReader.readLine()) % 42;
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(rests[i] == rests[j]) {
                    rests[i] = -1;
                }
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            if (rests[i] != -1) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}