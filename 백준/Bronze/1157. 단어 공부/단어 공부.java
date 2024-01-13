    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String word = bufferedReader.readLine().toUpperCase();

            char[] alpha = new char[word.length()];
            int[] count = new int[word.length()];

            for(int i = 0; i < word.length(); i++) {
                for(int j = 0; j < i + 1; j++) {
                    if(alpha[j] == word.charAt(i)) {
                        count[j]++;
                        break;
                    } else if(alpha[j] == 0){
                        alpha[j] = word.charAt(i);
                        count[j]++;
                        break;
                    }
                }
            }

            char result = 0;
            int check = 0;

            for(int i = 0; i < word.length(); i++) {
                if(count[i] != 0) {
                    if(count[i] > check) {
                        check = count[i];
                        result = alpha[i];
                    } else if(count[i] == check) {
                        result = '?';
                    }
                }
            }

            System.out.println(result);
        
        }
    }