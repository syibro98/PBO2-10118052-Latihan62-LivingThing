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
abstract public class LivingThing {
    abstract public void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Bernafas ");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " Makan ");
    }
}
