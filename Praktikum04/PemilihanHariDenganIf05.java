package Praktikum04;

import java.util.Scanner;

public class PemilihanHariDenganIf05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayCodeNumber, dayType;

        System.out.print("Input day name: ");
        dayCodeNumber = sc.nextLine();

        switch (dayCodeNumber.toLowerCase()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                dayType = "weekday";
                break;
            case "6":
            case "7":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid number";
        }

        System.out.println(dayCodeNumber + " is a " + dayType);
    }
}
