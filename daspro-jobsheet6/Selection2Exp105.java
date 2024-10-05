import java.util.Scanner;

/**
 * Selection2Exp105
 */
public class Selection2Exp105 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        short year;
        
        System.out.print("Input year : ");
        year = input05.nextShort();

        if (year%4 == 0) {
            if (year%100 != 0) {
                System.out.println("Leap year");
            } else if (year%400 != 0) {
                System.out.println("Not a leap year");
            } else 
                System.out.println("Leap year");
        } else 
            System.out.println("Not a leap year");   
    }
}