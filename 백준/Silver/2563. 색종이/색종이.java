import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 색종이 개수
        int num = Integer.parseInt(bufferedReader.readLine());

        // 색종이 위치
        int[][] location = new int[100][100];


        // 위치값 배열에 넣기
        // j = 0 x축, j = 1 y축
        for(int i = 0; i < num; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    location[j][k] = 1;
                }
            }
        }

        int sum = 0;

        for(int i = 0; i < location.length; i++) {
            for(int j = 0; j < location.length; j++) {
                if(location[i][j] != 0) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
        
    }
}