
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        int [][] nums = new int[n][2];

        for(int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");

            for(int j = 0; j < 2; j++) {
                nums[i][j] = Integer.parseInt(input[j]);
            }
        }

        bufferedReader.close();


        for(int i = 0; i < nums.length; i++) {
            bufferedWriter.write(String.valueOf(nums[i][0] + nums[i][1]));
            bufferedWriter.newLine();
        }


        bufferedWriter.flush();
        bufferedWriter.close();



    }
}