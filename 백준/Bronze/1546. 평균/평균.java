import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] input = bufferedReader.readLine().split(" ");
        double[] score = new double[n];
        // 최고 점수
        double m = 0;
        // 새로운 점수의 합
        double sum = 0;

        for(int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(input[i]);

            if(score[i] > m) {
                m = score[i];
            }
        }

        for(int i = 0; i < n; i++) {
            score[i] = (score[i] / m) * 100;
            sum += score[i];
        }

        double a = n;

        System.out.println(sum/a);



    }
}