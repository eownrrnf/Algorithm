    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String word = bufferedReader.readLine();

            String check = "";

            for(int i = word.length() - 1; i >= 0; i--) {
                check += word.charAt(i);
            }

            if(word.equals(check)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }