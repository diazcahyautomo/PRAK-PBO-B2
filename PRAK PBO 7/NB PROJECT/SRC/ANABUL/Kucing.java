/* Nama : Diaz Cahya Utomo - 24060123140213
 * File : Kucing.java
 * Tanggal : 01 Juni 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Kucing extends Anabul{
    public Kucing(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Kucing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kucing : Meong");
    }
}