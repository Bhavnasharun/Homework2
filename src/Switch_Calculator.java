import java.util.Scanner;

public class Switch_Calculator {
    public static void main(String[] args) {
char operator;
Double num1, num2, result;
//creat an object of scanner class
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your first number");
        num1=scanner.nextDouble();//answer will come out may be in double
        System.out.println("enter youd operator; +,-, *,or /");
        operator=scanner.next().charAt(0);//for the carector print out
        System.out.println("enter your second number");
        num2=scanner.nextDouble();// second number will come out
        switch (operator){//the methods
            case'+':
                result=num1+num2;
                System.out.println(num1+ "+"+num2+ "="+result);//will do add the number
                break;// will reak here
            case '-':
                result= num1-num2;
                System.out.println(num1+ "-"+num2+ "="+result);
                break;
            case '*':
                result=num1*num2;// time will do
                System.out.println(num1+"*"+num2+"="+result);
                break;
            case'/':
                result=num1/num2;// devision will do
                System.out.println(num1+"/"+num2+"="+result);
                break;
            default:// if user add somting differet then this message will apear
                System.out.println("Invalid operator");
                break;


        }


    }
}
