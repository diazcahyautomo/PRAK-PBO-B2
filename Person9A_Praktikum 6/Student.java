public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}

public class Person {
    private String name;

    public Person(String name) { this.name = name; }
    public boolean isAsleep(int hr) { return 22 < hr || 7 > hr; }
    public String toString()       { return name; }

    public void status(int hr) {
        if (this.isAsleep(hr))
            System.out.println("Now offline: " + this);
        else
            System.out.println("Now online: " + this);
    }
}

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) // override
    { return 2 < hr && 8 > hr; }
}

//1. Maka output yang didapat adalah: Now online: Sally
//2. Diskusikan bagaimana hasil tersebut didapatkan 
//   (hint: apakah “this” pada kelas Person dalam method status 
//    dieksekusi ketika compile time atau runtime)
//Jawab:
//Output "Now online: Sally" muncul karena:
//  - Variabel p bertipe Person, tetapi objek yang sebenarnya dibuat adalah Student.
//  - Method status() dipanggil dari kelas Person sesuai tipe referensi.
//  - Di dalam status(), dipanggil this.isAsleep(hr).
//  - Kata kunci this menunjuk ke objek nyata (runtime), yaitu objek Student.
//  - Karena isAsleep() dioverride di Student, maka method Student yang dijalankan saat runtime.
//  - Student.isAsleep(1) akan mengembalikan false (karena 1 tidak berada di antara 3 dan 7).
//  - Maka blok else dijalankan dan hasilnya adalah: "Now online: Sally"
