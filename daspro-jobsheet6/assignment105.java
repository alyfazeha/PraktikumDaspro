import java.util.Scanner;
/**
 * assignment105
 */
public class assignment105 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int num1, num2, num3, maxNum;

        System.out.print("Input the first number : ");
        num1 = input05.nextInt();
        System.out.print("Input the second number : ");
        num2 = input05.nextInt();
        System.out.print("Input the third number : ");
        num3 = input05.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("the maximum number is : " + num1);
            } else
                System.out.println("the maximum number is : " + num3);
        } else if (num2 > num3) {
            if (num2 > num1) {
                System.out.println("the maximum number is : " + num2);
            } else
                System.out.println("the maximum number is : " + num3);
        } else
            System.out.println("the maximum number is : " + num3);
    }
}