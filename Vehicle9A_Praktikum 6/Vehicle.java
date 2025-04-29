public class Vehicle {
    void calRent(int distances, float price) {
        float fare = distances * price;
        System.out.println("Vehicle price = " + fare);
    }
}

//Jawaban dari soal "Anggap jika kita mempunyai method hitungSewa(Vehicle v), analisalah keuntungan penggunaan teknik polimorfisme inclusion." ada di Main.java