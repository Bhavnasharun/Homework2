import java.util.Scanner;

public class Ranging_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            for (int j = 1; j <=i ; j++) {
                sum = sum + j ;//will add te num

            }
            System.out.println(sum);
            sum =0;

        }
    }
}
