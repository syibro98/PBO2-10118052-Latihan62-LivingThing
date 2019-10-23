/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan62.livingthing;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program dengan konsep abstraksi untuk menampilkan
 * perilaku benda hidup
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human manusia = new Human();
        manusia.setNama("Bagus Syibro Malisi" );
        manusia.walk(manusia.getNama());
        manusia.breath(manusia.getNama());
        manusia.eat(manusia.getNama());
    }
    
}
