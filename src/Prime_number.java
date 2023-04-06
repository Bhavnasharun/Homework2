import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int n,i,count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n value");
       // int count =0;
       // int num = scanner.nextInt();
        n= scanner.nextInt();
        for (i = 1; i <=n; i++) {
            if (n%i==0) {//number will devided by number and ans will 0
                count++;
            }

        }

if (count==2){
    System.out.println("give prime number");//if mathch and messase will apear
}
else {
    System.out.println("give a number is not prime number");
}
    }
}
