import java.util.Scanner;

public class Count_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any line");
        String str = scanner.next();
        //public int countchar(string str, char a)

int count =0;//value will be 0
char a;
        for (int i = 0; i < str.length(); i++) {
          //  if (str.charAt(i) != ' ')
           // if (str.charAt(i) == a)
                count ++;//count the a

        }
      System.out.println("Total numer of 'a' :"  + count );//number of a will read


//return count;




    }}


