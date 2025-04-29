public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}

//Jawaban dari soal "Anggap jika kita mempunyai method hitungSewa(Vehicle v), analisalah keuntungan penggunaan teknik polimorfisme inclusion." ada di Main.java