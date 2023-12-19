import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] input_arr1  = new int[9];
        int[] arr  = new int[9];

        for(int i = 0; i < 9; i++) {
            input_arr1[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int temp = 0;
        int max_index = 0;


        for (int i = 0; i < input_arr1.length; i++) {
            arr[i] = input_arr1[i];
        }


        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(input_arr1[i] == arr[8]) {
                max_index = i + 1;
            }
        }

        System.out.println(arr[8]);
        System.out.print(max_index);

    }
}