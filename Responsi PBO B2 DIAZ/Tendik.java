/*  Nama : Diaz Cahya Utomo
 *  Nim : 24060123140213
 *  Tanggal : 25 Maret 2025
 *  RESPONSI PBO B2
 */

public class Tendik extends Karyawan {
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
    }

    @Override
    public double hitungGaji(double gajiPokok) {
        return 4000000 + (getMasaKerja() * 0.01 * 4000000);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
