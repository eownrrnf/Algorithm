import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[][] character = new char[5][];

        for(int i = 0; i < character.length; i++) {
            String input = bufferedReader.readLine();

            // 배열 크기 정의
            character[i] = new char[input.length()];
            for(int j = 0; j < input.length(); j++) {
                character[i][j] = input.charAt(j);
            }
        }

        int longest_index = 0;

        // 가장 긴 인덱스를 가지고 있는 행의 길이 찾기
        for(int i = 0; i < character.length; i++) {
            if(character[i].length > longest_index) {
                longest_index = character[i].length;
            }
        }

        for(int i = 0; i < longest_index; i++) {
            for(int j = 0; j < character.length; j++) {
                // 행별 길이만큼 출력하기
                if(i < character[j].length) {
                    System.out.print(character[j][i]);
                }
            }
        }

    }
}