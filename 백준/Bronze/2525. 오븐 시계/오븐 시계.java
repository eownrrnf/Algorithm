
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String [] t = bufferedReader.readLine().split(" ");

        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);

        int a = Integer.parseInt(bufferedReader.readLine());

        // 현재 분과 계산 분의 합을 60으로 나눠 더해질 시간 계산
        int sum = (m + a)/60;

        int re_h = (h + sum) % 24;
        int re_m = (m + a) % 60;

        System.out.print(re_h + " ");
        System.out.print(re_m);

    }
}