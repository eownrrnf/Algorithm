    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine());

            for(int i = 0; i < n; i++) {
                for(int k = n - i -1; k > 0; k--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i > 0) {
                    for(int j = 0; j < i*2; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for(int i = n - 1; i > 0; i--) {
                for(int k = n - i; k > 0; k--) {
                    System.out.print(" ");
                }
                for(int j = 0; j < i*2-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }