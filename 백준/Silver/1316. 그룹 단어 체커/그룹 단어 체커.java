import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int count = 0;

        for(int i = 0; i < n; i++) {
            String word = bufferedReader.readLine();

            int check = 0;
            int[] alpha = new int[word.length()];

            for(int j = 0; j < word.length(); j++) {
                alpha[j] = word.charAt(j);
            }

            for(int k = 1; k < word.length(); k++) {
                if(alpha[k] != alpha[k-1]) {
                    for (int x = 0; x < k; x++) {
                        if(alpha[k] == alpha[x]) {
                            check++;
                        }
                    }
                }
            }

            if(check == 0) {
                count++;
            }
        }

        System.out.println(count);

    }
}