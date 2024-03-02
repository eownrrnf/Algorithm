import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = bufferedReader.readLine().split(" ");

        int day = 0;
        // 올라간 미터
        int win = 0;

        // 낮에 a미터 올라감
        int a = Integer.parseInt(inputs[0]);
        // 밤에 b미터 미끄러짐
        int b = Integer.parseInt(inputs[1]);
        // 목표 높이 v미터
        int v = Integer.parseInt(inputs[2]);

        // 기준을 애초에 낮 한번을 뺀 값으로!
        day = (v - a) / (a - b);

        win = (a - b) * day;

        while(true) {

            if(v - win == 0) break;
            else if (v - win <= a) {
                day++;
                break;
            } else if (v - win > a) {
                day++;
                win = win + a - b;
            }
        }
        System.out.println(day);
    }
}