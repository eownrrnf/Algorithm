import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] size = bufferedReader.readLine().split(" ");

        int row = Integer.parseInt(size[0]);
        int column = Integer.parseInt(size[1]);

        int[][] a = new int[row][column];
        int[][] b = new int[row][column];

        for(int i = 0; i < row; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            for(int j = 0; j < column; j++) {
                a[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i = 0; i < row; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            for(int j = 0; j < column; j++) {
                b[i][j] = Integer.parseInt(input[j]);
            }
        }

        int[][] result = new int[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}