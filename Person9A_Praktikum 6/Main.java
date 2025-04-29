public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}

//1. Maka output yang didapat adalah: Now online: Sally
//2. Diskusikan bagaimana hasil tersebut didapatkan 
//   (hint: apakah “this” pada kelas Person dalam method status 
//    dieksekusi ketika compile time atau runtime)
//Jawab:
//Output "Now online: Sally" muncul karena:
//  - Variabel p bertipe Person, namun objek yang dibuat adalah dari kelas Student.
//  - Method status() dipanggil dari kelas Person karena itu yang tersedia pada tipe referensi.
//  - Di dalam status(), terdapat pemanggilan this.isAsleep(hr).
//  - Kata kunci this merujuk pada objek nyata yang dibuat, yaitu Student, bukan hanya pada tipe Person.
//  - Oleh karena itu, method isAsleep(int hr) yang dijalankan adalah milik Student (override).
//  - Student.isAsleep(1) mengembalikan false, sehingga program mengeksekusi: 
//    System.out.println("Now online: " + name);
//  - Maka hasil akhirnya adalah: "Now online: Sally"