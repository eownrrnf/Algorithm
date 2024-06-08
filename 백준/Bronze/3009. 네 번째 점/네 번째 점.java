import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[][] points = new int[3][2];

        for(int i = 0; i < 3; i++) {

            String[] input = bufferedReader.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]);
            points[i][1] = Integer.parseInt(input[1]);
        }

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if(i != j) {

                    if(points[i][0] == points[j][0]) {
                        points[i][0] = 0;
                        points[j][0] = 0;
                    }
                    if(points[i][1] == points[j][1]) {
                        points[i][1] = 0;
                        points[j][1] = 0;
                    }

                }
            }
        }

        for(int i = 0; i < 3; i++) {
            if(points[i][0] != 0) {
                System.out.print(points[i][0] + " ");
            }
        }

        for(int i = 0; i < 3; i++) {
            if(points[i][1] != 0) {
                System.out.print(points[i][1]);
            }
        }
    }
}