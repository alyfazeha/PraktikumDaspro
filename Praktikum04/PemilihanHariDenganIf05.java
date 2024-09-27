package Praktikum04;

import java.util.Scanner;

public class PemilihanHariDenganIf05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayCodeNumber;

        System.out.print("Input day number: ");
        dayCodeNumber = sc.nextInt();

        if (dayCodeNumber <= 5){
            System.out.println(dayCodeNumber + " is a weekday");
        } else if (dayCodeNumber <8){
            System.out.println(dayCodeNumber + " is a weekend");
        } else if (dayCodeNumber >7){
            System.out.println(dayCodeNumber + " is unvalid number");
        }

    }
}
