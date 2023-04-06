import java.util.Scanner;

        public class Divide_3_5 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter any number and find saperat num");
                System.out.println("\n Divided by 3:");//this message will apear
                int num = scanner.nextInt();
                for (int i = 1; i < 100; i++) {
                    if (i%3 == 0)//here will devided by 3
                        System.out.println(i + " ,");
                }
                System.out.println("\n\n Divided by 5 :");
                for (int i = 1; i < 100; i++) {
                    if (i%5 == 0)//here will devided by 5
                        System.out.println(i +  " ,");

                }
        System.out.println("\n");

    }

}
