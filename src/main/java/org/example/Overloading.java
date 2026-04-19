package org.example;

public class Overloading {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.hitung(10));
        System.out.println(overloading.hitung(10, 8));
        System.out.println(overloading.hitung(5, 6, 8));
        overloading.showText("Mutia", 26);
        overloading.showText(26, "Mutia");

        System.out.println(overloading.tambah(5, 3));
        System.out.println(overloading.tambah(5.3, 2.0));
    }

    // Method 1 parameter → luas persegi
    public int hitung(int sisi) {
        System.out.println("Menghitung luas persegi");
        return sisi * sisi;
    }

    // Method 2 parameter → luas persegi panjang
    public int hitung(int panjang, int lebar) {
        System.out.println("Menghitung luas persegi panjang");
        return panjang * lebar;
    }

    // Method 3 parameter → volume balok
    public int hitung(int panjang, int lebar, int tinggi) {
        System.out.println("Menghitung volume balok");
        return panjang * lebar * tinggi;
    }

    public void showText(String nama, int umur) {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }

    public void showText(int umur, String nama) {
        System.out.println("Umur: " + umur + ", Nama: " + nama);
    }

    public int tambah(int a, int b) {
        return a + b;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

//    public int hitung(int sisi) {
//        System.out.println("Menghitung luas persegi");
//        return sisi*sisi;
//    }

    public void greet() {
        System.out.println("Hello");
    }
}
