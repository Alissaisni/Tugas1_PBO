/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no3;
import java.util.Scanner;

/**
 *
 * @author alissais
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Karakter pertama: ");
        char karakter1 = scanner.next().charAt(0);
        System.out.print("Karakter kedua: ");
        char karakter2 = scanner.next().charAt(0);

        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;
        
        int hasilPenjumlahan = kodeASCII1 + kodeASCII2;

        System.out.println("Kode ASCII dari " + karakter1 + " adalah " + kodeASCII1);
        System.out.println("Kode ASCII dari " + karakter2 + " adalah " + kodeASCII2);
        System.out.println("Maka hasil penjumlahan kode ASCII dari " + karakter1 + " dan " + karakter2 + " adalah: " + hasilPenjumlahan);

        scanner.close();  
    }
    
}
