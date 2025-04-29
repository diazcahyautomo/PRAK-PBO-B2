public class Main {
    public static void main(String[] args) {
        Anabul[] anabuls = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : anabuls) {
            a.bersuara();
            a.bergerak();
            System.out.println();
        }
    }
}
