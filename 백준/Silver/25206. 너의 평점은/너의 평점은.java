import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double[] credit = new double[20];
        double[] rating = new double[20];

        for(int i = 0; i < credit.length; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            credit[i] = Double.parseDouble(input[1]);
            switch (input[2]) {
                case "A+" : rating[i] = 4.5; break;
                case "A0" : rating[i] = 4.0; break;
                case "B+" : rating[i] = 3.5; break;
                case "B0" : rating[i] = 3.0; break;
                case "C+" : rating[i] = 2.5; break;
                case "C0" : rating[i] = 2.0; break;
                case "D+" : rating[i] = 1.5; break;
                case "D0" : rating[i] = 1.0; break;
                case "F" : rating[i] = 0.0; break;
                case "P" : rating[i] = -1; break;
            }
        }

        double sumOfCreditMulRating = 0.0;
        double sumCredit = 0.0;

        for(int i = 0; i < credit.length; i++) {
            if(rating[i] != -1) {
                sumOfCreditMulRating += (credit[i] * rating[i]);
                sumCredit += credit[i];
            }
        }

        System.out.println(sumOfCreditMulRating/sumCredit);

    }
}