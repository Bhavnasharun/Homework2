import java.util.Scanner;

public class Fibonacci_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        long a =0;//value of a
        long b =1;//value of b
        for (int i = 1; i < num; i++) {
            long c = a + b;//c is third value and add with a+b
            a=b;//
            b=c;
            System.out.println(c);//result will come

        }
    }
}
