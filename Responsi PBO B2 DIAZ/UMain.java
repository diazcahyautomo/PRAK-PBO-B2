/*  Nama : Diaz Cahya Utomo
 *  Nim : 24060123140213
 *  Tanggal : 25 Maret 2025
 *  RESPONSI PBO B2
 */

 public class UMain {
    public static void main(String[] args) {
        // Membuat Fakultas
        Fakultas fakultasKedokteran = new Fakultas("Fakultas Kedokteran", 6000000, 8000000);
        Fakultas fakultasEkonomi = new Fakultas("Fakultas Ekonomi", 5000000, 7500000);

        Fakultas[] daftarFakultas = {fakultasKedokteran, fakultasEkonomi};

        // Membuat Dosen
        Dosen dosen1 = new Dosen("Prof. Diaz", "diaz@anteks.ac.id", "11111", 12, "Fakultas Kedokteran");
        Dosen dosen2 = new Dosen("Dr. Ojan", "ojan@anteks.ac.id", "22222", 7, "Fakultas Ekonomi");

        // Membuat Tendik
        Tendik tendik1 = new Tendik("Pak Dito", "dito@anteks.ac.id", "33333", 18);
        Tendik tendik2 = new Tendik("Bu Pandor", "pandor@anteks.ac.id", "44444", 9);

        Karyawan[] daftarKaryawan = {dosen1, dosen2, tendik1, tendik2};

        // Membuat Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Ganen", "ganen@student.anteks.ac.id", "24060123140123", 4, "Fakultas Kedokteran");
        Mahasiswa mahasiswa2 = new Mahasiswa("Palih", "palih@student.anteks.ac.id", "24060123140124", 1, "Fakultas Ekonomi");

        // Membuat Universitas
        Universitas undip = new Universitas("Universitas Antek's", daftarFakultas, daftarKaryawan);

        // Menampilkan informasi Universitas
        System.out.println("===== INFORMASI UNIVERSITAS =====");
        System.out.println("Nama Universitas: " + undip.getNama());

        // Menampilkan informasi Fakultas
        System.out.println("\n===== INFORMASI FAKULTAS =====");
        for (Fakultas f : undip.getFakultas()) {
            System.out.println("Nama Fakultas: " + f.getNama());
            System.out.println("Tarif UKT: Rp" + f.getTarifUKT());
            System.out.println("Gaji Pokok Dosen: Rp" + f.getGajiPokok());
            System.out.println("--------------------------------");
        }

        // Menampilkan informasi Karyawan
        System.out.println("\n===== INFORMASI KARYAWAN =====");
        for (Karyawan k : undip.getKaryawan()) {
            k.getInfo();
            System.out.println("Gaji: Rp" + k.hitungGaji(8000000)); // Contoh dengan gaji pokok 8 juta
            System.out.println("--------------------------------");
        }

        // Menampilkan informasi Mahasiswa
        System.out.println("\n===== INFORMASI MAHASISWA =====");
        mahasiswa1.getInfo();
        System.out.println("UKT yang harus dibayar: Rp" + mahasiswa1.hitungUKT(fakultasKedokteran.getTarifUKT()));

        System.out.println();
        mahasiswa2.getInfo();
        System.out.println("UKT yang harus dibayar: Rp" + mahasiswa2.hitungUKT(fakultasEkonomi.getTarifUKT()));
    }
}
