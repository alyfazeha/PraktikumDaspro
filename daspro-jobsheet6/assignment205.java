import java.util.Scanner;

public class assignment205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String category;
        int numBook;
        double discount;

        System.out.print("input the category of book : ");
        category = input05.nextLine();
        System.out.print("input the number of book : ");
        numBook = input05.nextInt();

        if (category.equalsIgnoreCase("dictionary") && numBook <= 2) {
            System.out.println(" discount : 0.1");
        } else if (category.equalsIgnoreCase("dictionary") && numBook > 2) {
            System.out.println(" discount : 0.1 + 0.02");
        } else if (category.equalsIgnoreCase("novel") && numBook <= 3) {
            System.out.println(" discount : 0.07 + 0.01");
        } else if (category.equalsIgnoreCase("novel") && numBook > 3) {
            System.out.println(" discount : 0.07 + 0.02");
        } else if (numBook > 3) {
            System.out.println(" discount : 0.5 ");
        } else
            System.out.println(" discount : 0.0");
    }
}
