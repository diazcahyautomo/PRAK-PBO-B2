/*  Nama : Diaz Cahya Utomo
 *  Nim : 24060123140213
 *  Tanggal : 25 Maret 2025
 *  RESPONSI PBO B2
 */

public class Universitas {
    private String nama;
    private Fakultas[] fakultas;
    private Karyawan[] karyawan;

    public Universitas(String nama, Fakultas[] fakultas, Karyawan[] karyawan) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.karyawan = karyawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Fakultas[] getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas[] fakultas) {
        this.fakultas = fakultas;
    }

    public Karyawan[] getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan[] karyawan) {
        this.karyawan = karyawan;
    }
}
