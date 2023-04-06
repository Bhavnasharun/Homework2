import java.util.Scanner;

public class Month_name {
    Scanner scanner = new Scanner(System.in);
    // no return type no perameter
    void month_name(){
        System.out.println("enter any 1 to 12 numbers");
        int num = scanner.nextInt();


        switch (num){  case 1://month one will print out
            System.out.println("January");
            break;// will break here and if not 1 mont then will go nextxdd
            case 2:
                System.out.println("February");
                break;

            case 3://tird month
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");//print out the april

                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
            case 7:
                System.out.println("Jully");
            case 8 :
                System.out.println("August");
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");// print out the month 10
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");


        }

    }
    public static void main(String[] args) {// main method and print
        Month_name month_name = new Month_name();// this have tomention here the class
        month_name.month_name();//have to bring method here to print



    }
}


