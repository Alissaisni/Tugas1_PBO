/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no1;
import java.util.Scanner;

/**
 *
 * @author alissais
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan 3 bilangan desimal negatif (contoh -7,5):");

        System.out.print("Bilangan pertama: ");
        double bil1 = scanner.nextDouble();

        System.out.print("Bilangan kedua: ");
        double bil2 = scanner.nextDouble();

        System.out.print("Bilangan ketiga: ");
        double bil3 = scanner.nextDouble();

        double hasilJumlah = bil1 + bil2 + bil3;
        double hasilKurang = bil1 - bil2 - bil3;
        double hasilKali = bil1 * bil2 * bil3;
        double hasilBagi = bil1 / bil2 / bil3;

        System.out.println("Hasil penjumlahan: " + String.format("%.2f", hasilJumlah));
        System.out.println("Hasil pengurangan: " + String.format("%.2f", hasilKurang));
        System.out.println("Hasil perkalian: " + String.format("%.2f", hasilKali));
        System.out.println("Hasil pembagian: " + String.format("%.2f", hasilBagi));

        
        scanner.close();
    }
}
