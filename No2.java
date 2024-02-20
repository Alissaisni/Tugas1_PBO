/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no2;
import java.util.Scanner;
/**
 *
 * @author alissais
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Usia saat ini: ");
        int age = scanner.nextInt();

        System.out.print("Uang tabungan saat ini: ");
        double tabungan = scanner.nextDouble();

        System.out.print("Apakah Anda sudah memiliki calon pasangan?(true/false): ");
        boolean calonPasangan = scanner.nextBoolean();

        if (age >=  19 && tabungan >  100000000 && calonPasangan) {
            System.out.println(name + ", Anda sudah saatnya menikah. Anda telah melebihi  100 juta dan sudah memiliki calon pasangan.");
        } else {
            System.out.println("Maaf " + name + ", Anda belum memenuhi syarat untuk menikah. Pastikan Anda berusia minimal  19 tahun, memiliki tabungan lebih dari  100 juta, dan sudah memiliki calon pasangan.");
        }

        scanner.close();
    }
    
}
