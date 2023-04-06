import java.util.Scanner;

public class Factorial_nummber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();// will print out
        int fact =1;//value will start from 1
        for (int i = 1; i <=num ; i++) {// encease number
        fact= fact * i;//will do time here
        //8if(num<0);
        }
        System.out.println("Factorial of the number:"+fact);


    }}

