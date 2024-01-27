import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer word = new StringBuffer(bufferedReader.readLine());

        // 크로아티아 알파벳 목록
        String[] pre_arr = {"dz=", "lj", "nj"};
        String[] arr = {"c=", "c-", "d-", "s=", "z="};

        int ori_count = 0;
        int tem_count = 0;


        while (true) {
            for (int i = 0; i < pre_arr.length; i++) {
                int pre_index = word.indexOf(pre_arr[i]);
                if (pre_index != -1) {
                    if (pre_arr[i].equals("dz=")) {
                        tem_count++;
                        word.replace(pre_index, pre_index + 3, "0");
                    } else {
                        tem_count++;
                        word.replace(pre_index, pre_index + 2, "0");
                    }
                }
            }

            if (ori_count != tem_count) {
                ori_count = tem_count;
            } else {
                break;
            }
        }


        while (true) {
            for (int i = 0; i < arr.length; i++) {
                int index = word.indexOf(arr[i]);
                if (index != -1) {
                    tem_count++;
                    word.replace(index, index + 2, "0");
                }
            }

            if (ori_count != tem_count) {
                ori_count = tem_count;
            } else {
                break;
            }
        }


        String tem_word = word.toString();
        String last_word = tem_word.replaceAll("0","");
        System.out.println(ori_count + last_word.length());
    }
}