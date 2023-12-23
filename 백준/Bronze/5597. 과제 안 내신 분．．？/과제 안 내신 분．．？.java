import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] attendances = new int[30];
        int[] submissions = new int[28];
        int[] doNotSub = new int[2];

        // 기본 출석자 저장
        for(int i = 0; i < attendances.length; i++) {
            attendances[i] = i + 1;
        }

        // 제출자 저장
        for(int i = 0; i < submissions.length; i++) {
            int submission = Integer.parseInt(bufferedReader.readLine());

            if(submission < 0 && submission > 31) {
                System.out.println("없는 번호입니다. 다시 입력하세요.");
                return;
            }else {
                if(i == 0) {
                    submissions[i] = submission;
                }else if(i > 0){
                    for(int j = 0; j < i; j++) {
                        if(submissions[j] == submission) {
                            System.out.println("이미 제출한 번호입니다. 다시 입력하세요.");
                            i = i - 1;
                        }else{
                            submissions[i] = submission;
                        }
                    }
                }
            }
        }

        // 제출자 0으로 바꾸기
        for(int i = 0; i < attendances.length; i++) {
            for(int j = 0; j < submissions.length; j++) {
                if(attendances[i] == submissions[j]) {
                    attendances[i] = 0;
                }
            }
        }

        // 0인 미제출자 배열에 저장
        for(int j = 0; j < doNotSub.length; j++) {
            for(int i = 0; i < attendances.length; i++) {
                if(attendances[i] != 0) {
                    doNotSub[j] = attendances[i];
                    attendances[i] = 0;
                    break;
                }
            }
        }

        // 작은 수 먼저 출력
        if(doNotSub[0] > doNotSub[1]) {
            System.out.println(doNotSub[1]);
            System.out.println(doNotSub[0]);
        } else {
            System.out.println(doNotSub[0]);
            System.out.println(doNotSub[1]);
        }

    }
}