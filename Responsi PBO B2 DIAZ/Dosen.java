/*  Nama : Diaz Cahya Utomo
 *  Nim : 24060123140213
 *  Tanggal : 25 Maret 2025
 *  RESPONSI PBO B2
 */

public class Dosen extends Karyawan{
    private String fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, String fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /*edit*/
    @Override
    public double hitungGaji(double gajiPokok) {
        return gajiPokok + (gajiPokok * getMasaKerja() * 0.01);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
