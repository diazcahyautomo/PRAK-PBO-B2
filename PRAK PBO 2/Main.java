public class Main {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ML = new MataKuliah("ML", "Mobile Legends", 3);
        Mahasiswa M1 = new Mahasiswa("213", "Diaz", "Informatika");
        Dosen D1 = new Dosen("666", "Draco", "Informatika");
        Kendaraan K1 = new Kendaraan("B123499", "Helikopter");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.addMatkul(ML);
        M1.printDetailMhs();
    }
}