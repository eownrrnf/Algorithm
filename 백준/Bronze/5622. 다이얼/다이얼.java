    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String input = bufferedReader.readLine();

            int[] seconds = new int[input.length()];

            char[][] dials = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'},
                             {'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'},
                             {'T', 'U', 'V'}, {'W', 'X', 'Y', 'Z'}};

            for(int i = 0; i < input.length(); i++) {
                for(int j = 0; j < dials.length; j++) {
                    for(int k = 0; k < dials[j].length; k++) {
                        if (input.charAt(i) == dials[j][k]) {
                            seconds[i] = j + 3;
                            break;
                        }
                    }
                }
            }

            int sum = 0;

            for(int i = 0; i < seconds.length; i++) {
                sum += seconds[i];
            }

            System.out.println(sum);
        }
    }