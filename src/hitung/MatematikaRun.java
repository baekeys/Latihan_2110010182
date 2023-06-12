/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author rizqi
 */
public class MatematikaRun {
    public static void main(String[] args) {
        
        //membuat objek
        Matematika rizqi = new Matematika(8,2);
        
        System.out.println("Hasil Penjumlahan : "+rizqi.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+rizqi.setPengurangan());
        System.out.println("Hasil Perkalian : "+rizqi.setPerkalian());
        System.out.println("Hasil Pembagian : "+rizqi.setPembagian());
    }
   
    
}
