import java.util.Scanner;

/**
 * Selection2Exp205
 */
public class Selection2Exp205 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int angle1, angle2, angle3, totalAngle;

        System.out.print("Input the first angle : ");
        angle1 = input05.nextInt();
        System.out.print("Input the second angle : ");
        angle2 = input05.nextInt();
        System.out.print("Input the third angle : ");
        angle3 = input05.nextInt();

        totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right triangle");
            } else
                System.out.println("Not a right triangle");
        } else
            System.out.println("Not a triangle");
    }
}