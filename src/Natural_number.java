import java.util.Scanner;

public class Natural_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");// message will apear
        int num = scanner.nextInt();//allow to user num
        int sum = 0;//sum will be 0

        for (int i = 1; i <=num ; i++) {//number will start from 1
            sum +=i;// add the numer
            System.out.println("sum="+i);//sum = sum+i //i


        }
        System.out.println("Sum="+sum);// will do add all to gater


    }
}


