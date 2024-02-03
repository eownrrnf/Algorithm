import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");

        int notation = Integer.parseInt(input[1]);
        // input[0] 입력 값 input[] 진법 자릿수? notation
        // input[0] = 10;
        // input[1] = 2;

        int result = 0;

        for(int i = 0; i < input[0].length(); i++) {
            int digit = 1;

            // 자릿수별로 가중치 구하기
            // 1의 자리일 때 digit = 1;
            if(i != input[0].length() - 1) {
                for(int j = 0; j < input[0].length() - i - 1; j++) {
                    digit *= notation;
                }
            }

            if(input[0].charAt(i) < 'A') {
                result += (input[0].charAt(i) - 48) * digit;
            } else {
                result += (input[0].charAt(i) - 55) * digit;
            }
        }

        System.out.println(result);
        
    }
}