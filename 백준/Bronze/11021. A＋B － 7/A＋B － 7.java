import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[][] arr_line = new int[t][2];  
        
        for(int i = 0; i < t; i++) {

            String[] arr = br.readLine().split(" "); 
                
            arr_line[i][0] = Integer.parseInt(arr[0]);
            arr_line[i][1] = Integer.parseInt(arr[1]);
            
        
        }

        for(int i = 0; i < t; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            System.out.println(arr_line[i][0] + arr_line[i][1]);
        }
        
    }
}
