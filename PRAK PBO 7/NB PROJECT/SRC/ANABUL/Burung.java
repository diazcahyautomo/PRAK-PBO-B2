/* Nama : Diaz Cahya Utomo - 24060123140213
 * File : Anjing.java
 * Tanggal : 01 Juni 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Burung extends Anabul{
    public Burung(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Burung : Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Burung : Cuit");
    }
}
