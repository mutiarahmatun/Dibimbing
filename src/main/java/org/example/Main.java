package org.example;
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();

//        System.out.println(obj.getAngka());
//        System.out.println(obj.getCumulativeData());
//        System.out.println(obj.getNilaiDouble());
//        System.out.println(obj.getHuruf());
//        System.out.println(obj.isLogin());
//        System.out.println(obj.getNama());
//        System.out.println();
//
//        System.out.println("Hasil jadi penjumlahan = " + obj.tambah(5, 6));
//        System.out.println("Hasil dari pengurangan = " + obj.kurang(6,7));
//        System.out.println("Boolean kelulusan = " + obj.isLulus(65));
//        System.out.println("Boolean kelulusan = " + obj.isLulus(89));
//        System.out.println(obj.getGreeting("Mutiii"));
//        System.out.println("Harga setelah diskon = " + obj.hitungDiskon(10000000, 10));

        System.out.println(obj.kurang(5, 4));
        System.out.println(obj.kurang("10", "6"));
        System.out.println(obj.kurang(10, 5, 2));
    }

    public int getAngka() {
        return 10;
    }

    public long getLongValue() {
        return 100000L;
    }

    public int getCumulativeData() {
        int cumulatif = getAngka() * 2;
        return cumulatif;
    }

    public double getNilaiDouble() {
        return 3.14;
    }

    public char getHuruf() {
        return 'A';
    }

    public boolean isLogin() {
        return true;
    }

    public String getNama() {
        return "Mutia";
    }

    public int tambah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    public int kurang(int a, int b) {
        return a-b;
    }

    public int kurang(int a, int b, int c) {
        return a-b-c;
    }

    public int kurang(String a, String b) {
        int aString = Integer.valueOf(a);
        int bString = Integer.valueOf(b);
        return aString-bString;
    }

    public boolean isLulus(int nilai) {
        if (nilai >= 75) {
            return true;
        }
        return false;
    }

    public String getGreeting(String nama) {
        return "Halo, " + nama + "!";
    }

    public double hitungDiskon(double harga, double persenDiskon) {
        double diskon = harga * persenDiskon / 100;
        return harga - diskon;
    }


}
