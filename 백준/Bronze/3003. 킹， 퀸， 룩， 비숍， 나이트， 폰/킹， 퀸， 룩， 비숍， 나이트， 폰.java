    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int[] piece = {1, 1, 2, 2, 2, 8};

            String[] inputs = bufferedReader.readLine().split(" ");

            for(int i = 0; i < piece.length; i++) {
                System.out.print(piece[i] - Integer.parseInt(inputs[i]));
                System.out.print(" ");
            }

        }
    }