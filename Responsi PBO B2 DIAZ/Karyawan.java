/*  Nama : Diaz Cahya Utomo
 *  Nim : 24060123140213
 *  Tanggal : 25 Maret 2025
 *  RESPONSI PBO B2
 */

public abstract class Karyawan extends CivitasAkademik{
    private String NIP;
    private int masaKerja;
    
    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji(double gajiPokok);

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja);
    }
 }
