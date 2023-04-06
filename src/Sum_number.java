import java.util.Scanner;

public class Sum_number {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int n =10;
        int sum = 0;//value of the sum
        for (int i = 0; i <n ; i++) {
            sum += i;//adding here their sum
            System.out.println(sum);
        }


    }
}
