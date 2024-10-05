import java.util.Scanner;

public class assignment305 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String brand, category;
        int size, price;

        System.out.print("input the brand : ");
        brand = input05.nextLine();
        System.out.print("input the category : ");
        category = input05.nextLine();
        System.out.print("input the size : ");
        size = input05.nextInt();

        if (brand.equalsIgnoreCase("converse")) {
            if (category.equalsIgnoreCase("slip-on")) {
                if (size < 36) {
                    System.out.println("Price = Rp. 0");
                } else if (size > 40) {
                    System.out.println("Price = Rp. 0 ");
                } else 
                    System.out.println("Price = Rp. 800.000");
            } else if (size < 40) {
                System.out.println("Price = Rp. 0");
            } else if (size > 44) {
                System.out.println("Price = Rp. 0");
            } else 
                System.out.println("Price = Rp. 1.200.000");
        } else if (brand.equalsIgnoreCase("sketcher")) {
            if (category.equalsIgnoreCase("woman")) {
                if (size < 36) {
                    System.out.println("Price = Rp. 0");
                } else if (size > 41) {
                    System.out.println("Price = Rp. 0 ");
                } else 
                    System.out.println("Price = Rp. 1.000.000");
            } else if (size < 41) {
                System.out.println("Price = Rp. 0");
            } else if (size > 44) {
                System.out.println("Price = Rp. 0");
            } else 
                System.out.println("Price = Rp. 1.800.000");
        } else if (brand.equalsIgnoreCase("nike")) {
            if (category.equalsIgnoreCase("kids")) {
                if (size < 36) {
                    System.out.println("Price = Rp. 0");
                } else if (size > 40) {
                    System.out.println("Price = Rp. 0 ");
                } else 
                    System.out.println("Price = Rp. 750.000");
            } else if (size < 40) {
                System.out.println("Price = Rp. 0");
            } else if (size > 44) {
                System.out.println("Price = Rp. 0");
            } else 
                System.out.println("Price = Rp. 1.500.000");
        } 
    }
}
