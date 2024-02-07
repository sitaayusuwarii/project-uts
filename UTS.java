/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author LAPTOPS
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah ingin input data? (Y/T) : ");
        String jawab = input.nextLine();
        
        double gaji = 5000000;
        int totalTarget = 0;
        int totalRealisasi = 0;
        
        while (jawab.equalsIgnoreCase("Y")) {
            System.out.println("Nama sales : ");
            String namaSales = input.nextLine();
            
            //input target
            int target = 4;
            for (int i = 0; i < 4; i++) {
                System.out.print("Target minggu "+ (i + 1) + ": ");
                target = input.nextInt();
                totalTarget += target;
            }
            int realisasi = 4;
            for (int i = 0; i < 4; i++) {
                System.out.print("Realisasi minggu "+ (i + 1) + ": ");
                realisasi = input.nextInt();
                totalRealisasi += realisasi;
            }
            double capaianKerja = (totalTarget / totalRealisasi) * 100;
            
            //Hitung bonus
            double bonus = 0;
            if (capaianKerja > 0.89) {
                bonus = 3000000;
            } else if (capaianKerja > 0.79) {
                bonus = 1500000;
            }
            // Hitungtotal gaji
            double totalGaji = gaji + bonus;
            
            //output total gaji
            System.out.println("Total gaji untuk "+ namaSales + " adalah : "+ totalGaji);
            
            //reset nilai
            totalRealisasi = 0;
            totalTarget = 0;
            
            //input tambahan data atau tidak
            input.nextLine();
            System.out.print("Apakah ingin input data lagi? (Y/T) : ");
            jawab = input.nextLine();
        }
    }
    
}
