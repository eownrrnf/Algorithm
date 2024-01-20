import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[9][9];

        for(int i = 0; i < matrix.length; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        int max = 0;
        int row = 0;
        int column = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] >= max) {
                    max = matrix[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(row + " " + column);
    }
}