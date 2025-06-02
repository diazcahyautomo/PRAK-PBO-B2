/* Nama : Diaz Cahya Utomo - 24060123140213
 * File : ContohMetodeGenerik.java
 * Tanggal : 01 Juni 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class ContohMetodeGenerik {
    public <G extends Anabul> G fungsi (Datum<G> d) {
        return d.getIsi();
    }
}
