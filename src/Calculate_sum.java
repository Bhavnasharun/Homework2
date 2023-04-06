import java.util.Scanner;

public class Calculate_sum  {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num  = scanner.nextInt();
        double sum = 0;// put double beacuse answer can come in point
        for (int i = 2  ; i < num; i++) {
            sum +=1.0/i;

        }
        System.out.println("The sum of series is :"+sum);
        }
    }

