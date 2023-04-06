import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        int multiplication =1;//value will start fro here
        for (int i = num; i <= num; i++) {// you can get any number will get table
            System.out.println(i);
            for (int j = 0; j <=12 ; j++) {//until 12 table will print
                System.out.println(i + "x" +j+" = "+i*j);
            }

        }

    }
}
