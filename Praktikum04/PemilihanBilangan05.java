package Praktikum04;

import java.util.Scanner;

/**
 * PemilihanBilangan05
 */
public class PemilihanBilangan05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? ("Angka " + angka + " termasuk bilangan genap. " ) : ( "Angka " + " termasuk bilangan ganjil. ");
        System.out.println(hasil);
       
    }
}

 //the code before
        // if (angka % 2 == 0) 
        // {
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");    
        // }
        // else
        // {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }