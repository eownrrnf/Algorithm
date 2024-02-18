import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // t번째 분수 구하기
        int t = Integer.parseInt(bufferedReader.readLine());

        int turn = 0;
        int sum = 2;
        int x = 0;
        int y = 0;

        while(true) {

            for(int i = 0; i < sum - 1; i++) {

                if(sum % 2 == 1) {
                    if(i == 0) {
                        x = 1;
                        y = sum - 1;
                    } else {
                        x++;
                        y--;
                    }
                }else {
                    if(i == 0) {
                        x = sum - 1;
                        y = 1;
                    } else {
                        x--;
                        y++;
                    }
                }

                turn++;

                if(turn == t) break;

            }

            if(turn == t) break;

            sum++;


        }
        System.out.println(x + "/" + y);
    }


}