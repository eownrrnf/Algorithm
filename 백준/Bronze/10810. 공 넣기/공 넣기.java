import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // 바구니 개수 n개
        // 각각의 바구니 1~n번
        // 공 번호 1~n번
        // 가장 처음 바구니에는 공이 없고, 바구니에는 공 1개만 넣을 수 있음

        // m번 공을 넣을거임
        // 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고,
        // 정한 바구니에 모두 같은 번호가 적힌 공을 넣는다.
        // 공이 이미 있는 경우, 기존 공을 빼고 새로운 공을 넣는다.
        // 공을 넣을 바구니는 연속 ex) 2~4;

        // 공을 어떻게 넣을 지 주어졌을 때, m번 공을 넣은 이후에 각 바구니에 어떤 공이 들어있을까?

        // n, m이 주어짐
        // 세개의 정수가 주어짐
        // i ~ j 바구니까지 k번호가 적혀져 있는 공을 넣는다.

        // 1차원 배열
        // 바구니 번호는 인덱스 + 1
        // 공 번호는 인덱스의 값. 계속 바뀐다

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] bucketCount_num = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(bucketCount_num[0]);
        int m = Integer.parseInt(bucketCount_num[1]);

        int[] ball_nums = new int[n];

        int[][] range_num = new int[m][3];


        for(int i = 0; i < m; i++) {
            String[] inputs = bufferedReader.readLine().split(" ");

            range_num[i][0] = Integer.parseInt(inputs[0]);
            range_num[i][1] = Integer.parseInt(inputs[1]);
            range_num[i][2] = Integer.parseInt(inputs[2]);
        }

        for(int i = 0; i < m; i++) {
            for(int j = range_num[i][0] - 1; j < range_num[i][1]; j++) {
                ball_nums[j] = range_num[i][2];
            }
        }

        for (int i = 0; i < ball_nums.length; i++) {
            System.out.print(ball_nums[i] + " ");
        }
        
    }
}