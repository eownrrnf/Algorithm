import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");

        // 진법 단위
        int notation = Integer.parseInt(input[1]);
        // 10진법 입력 숫자
        int num = Integer.parseInt(input[0]);
        // n집법 변환 결과
        String result = "";

        int quotient = 0;
        int remainder = 0;


        while (true) {

            // 나누기 몫
            quotient = num / notation;
            // 나머지 값
            remainder = num % notation;


            if(num < notation) {
                // 입력값이 n보다 작을 경우
                    // 나머지값이 10보다 작을 경우
                    if(remainder < 10) {
                        result = result.concat(String.valueOf(remainder));
                        // 나머지 값이 10보다 크거나 같을 경우
                    } else {
                        result = result.concat(Character.toString((char)(remainder + 55)));
                    }
                    break;
            } else {
                // 나머지값이 10보다 작을 경우
                if(remainder < 10) {
                    result = result.concat(String.valueOf(remainder));
                    // 나머지 값이 10보다 크거나 같을 경우
                } else {
                    result = result.concat(Character.toString((char)(remainder + 55)));
                }

                num = quotient;


                // 몫이 n보다 작을 경우
                if(num < notation) {
                    // 나머지값이 10보다 작을 경우
                    if(quotient < 10) {
                        result = result.concat(String.valueOf(quotient));
                        // 나머지 값이 10보다 크거나 같을 경우
                    } else {
                        result = result.concat(Character.toString((char)(quotient + 55)));
                    }
                    break;
            }


            }
        }

        String fin_result = "";
        for(int i = result.length() - 1; i >= 0; i--) {
            fin_result = fin_result.concat(Character.toString(result.charAt(i)));
        }
        System.out.println(fin_result);
    }
}