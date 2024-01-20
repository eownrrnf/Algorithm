import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 총 n개
        // m번 순서를 역순으로 정렬한다
        // i ~ j 까지의 바구니는 역순으로 정렬


        String[] input_time = bufferedReader.readLine().split(" ");

        // 총 바구니 개수
        int n = Integer.parseInt(input_time[0]);
        // 역순 횟수
        int m = Integer.parseInt(input_time[1]);

        // 역순 범위
        int[][] input_arr = new int[m][2];

        for(int i = 0; i < m; i++) {
            String[] input = bufferedReader.readLine().split(" ");

            // 바구니 번호를 입력 받으니 index얻기 위해 -1
            input_arr[i][0] = Integer.parseInt(input[0]) - 1;
            input_arr[i][1] = Integer.parseInt(input[1]) - 1;

        }

        int[] baskets = new int[n];

        for(int i = 0; i < n; i++) {
            // 바구니 번호 index + 1
            baskets[i] = i + 1;
        }

        int tem = 0;
        for(int i = 0; i < m; i++) {
            // index 범위 a ~ b까지 내림차순 정렬
            int a = input_arr[i][0];
            int b = input_arr[i][1];

            if(a < b) {
                for(int j = a, k = b; j <= k; j++, k--) {
                        tem = baskets[j];
                        baskets[j] = baskets[k];
                        baskets[k] = tem;
                }
            }
        }

        for(int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}