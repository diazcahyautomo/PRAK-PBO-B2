public class Main {
    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);
    }

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil      = new Car();
        Vehicle bis        = new Bus();

        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bis);
    }
}

//Anggap jika kita mempunyai method hitungSewa(Vehicle v), analisalah keuntungan penggunaan teknik polimorfisme inclusion.
//Jawaban: 
        //1. Cukup satu metode untuk menangani semua jenis kendaraan (Vehicle, Car, Bus).
        //2. Meskipun parameternya Vehicle, metode calRent() yang dipanggil sesuai dengan tipe objek sebenarnya (Car mengurangi biaya 100, Bus dan Vehicle tidak).
        //3. Menambah jenis kendaraan baru tidak perlu mengubah metode hitungSewa().