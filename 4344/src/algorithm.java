import java.util.*;

public class algorithm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int test_n = scan.nextInt();
        double[] result = new double[test_n];

        for(int i = 0 ; i < test_n ; i++){
            int[] score = new int[1000];
            int sum = 0;
            double average = 0;

            int student_n = scan.nextInt();
            for(int j = 0 ; j < student_n ; j++){
                score[j] = scan.nextInt();
                sum += score[j];
            }
            average = sum / student_n;

            int count = 0;

            for(int k = 0 ; k < student_n ; k++){
                if(average < score[k])
                    count++;
            }
            result[i] = (double)count / student_n * 100;
        }

        for(int i = 0 ; i < test_n ; i ++)
            System.out.println(String.format("%.3f", result[i]));
    }
}
