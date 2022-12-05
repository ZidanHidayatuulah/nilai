/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int a = 0; a <= 5; a++) {
//            for (int c = 5; c >= a; c--) {
//                System.out.print(" ");
//            }
//            for (int b = 1; b <= a; b++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

Scanner input = new Scanner (System.in);


        System.out.println("masukkan NILAI anda");  
        int nilai = input.nextInt();
        
        
        if (nilai<60){
            System.out.println("nilai anda kurang silahkan mengikuti remidi atau ke gulag");
        }else if (nilai<70){
            System.out.println("nilai anda cukup tapi tetap harus mengikuti remidi");
        }else if (nilai<80){
            System.out.println("nilai anda cukup bagus pertahankan ditingkatkan lagi nilainya");
        }else if (nilai<90){
            System.out.println("nilai anda bagus pertahankan");
        }else if(nilai>90){
            System.out.println("Luar Biasa nilai anda sangat bagus pertahankan nilainya");
        }
    }
}
