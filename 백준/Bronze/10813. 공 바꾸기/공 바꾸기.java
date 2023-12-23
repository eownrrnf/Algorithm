import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // 바구니 개수 n개
        // 각각의 바구니 1~n번
        // 공 번호 1~n번
        // 가장 처음 바구니 번호의 공이 들어있음.
        // index + 1 = 처음 공 번호;

        // m번 공을 바꿀거임
        // 바꿀 바구니 2개를 선택하고 두 바구니에 있는 공을 교환
        //

        // 1차원 배열
        // 바구니 번호는 인덱스 + 1
        // 공 번호는 인덱스의 값. 계속 바뀐다

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] bucketCount_num = bufferedReader.readLine().split(" ");

        // 바구니 개수
        int n = Integer.parseInt(bucketCount_num[0]);
        // 바꿀 횟수
        int m = Integer.parseInt(bucketCount_num[1]);

        // 바구니랑 공 번호 세팅
        int[] ball_nums = new int[n];
        for(int i = 0; i < n; i++) {
            ball_nums[i] = i + 1;
        }


        int[][] change_buscket = new int[m][2];


        for(int i = 0; i < m; i++) {
            String[] inputs = bufferedReader.readLine().split(" ");

            change_buscket[i][0] = Integer.parseInt(inputs[0]) - 1;
            change_buscket[i][1] = Integer.parseInt(inputs[1]) - 1;
        }

        int tem = 0;
        for(int i = 0; i < m; i++) {
            tem = ball_nums[change_buscket[i][0]];
            ball_nums[change_buscket[i][0]] = ball_nums[change_buscket[i][1]];
            ball_nums[change_buscket[i][1]] = tem;
        }

        for (int i = 0; i < ball_nums.length; i++) {
            System.out.print(ball_nums[i] + " ");
        }

    }
}