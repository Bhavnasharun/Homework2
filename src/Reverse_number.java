import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int num =0;
int reversenum =0;
        System.out.println("Input your number");
        num =scanner.nextInt();
        for( ; num !=0;){//!= means reverse number
            reversenum =reversenum*10;//will do time hear with numbers
            reversenum = reversenum + num%10;//reverse numer add number and devid
            num =num/10;
        }
        System.out.println("Reverse of specified is :"+reversenum  );//result will apera
    }
}
