/* Nama : Diaz Cahya Utomo - 24060123140213
 * File : ContohMetodeGenerik.java
 * Tanggal : 01 Juni 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Datum<G> {
   private G isi;
   
   public void setIsi(G isi){
       this.isi = isi;
   }
   
   public G getIsi(){
       return this.isi;
   }
}
