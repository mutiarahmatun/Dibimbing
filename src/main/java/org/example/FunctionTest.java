package org.example;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest ft = new FunctionTest();
        ft.tampilkanSalam();
        ft.tampilkanGaris();
        ft.tampilkanInfoSekolah();

        printNama();

        ft.tampilkanGaris();
        ft.sapaNama("Mutia");
        ft.tampilkanBiodata("Mutia", 26, "Jakarta");
        ft.hitungLuasPersegiPanjang(15, 8);
        ft.hitungLuasPersegiPanjang(20, 10);
        ft.isLoginSuccess(false);
        ft.hitungKelilingPersegiPanjang(15, 8);
    }

    public void sapaNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    static void printNama() {
        System.out.println("My name is mutia");
    }

    public void tampilkanSalam() {
        System.out.println("Selamat datang di Program Java!");
        System.out.println("Semoga hari Anda menyenangkan 😊");
    }

    public void tampilkanGaris() {
        System.out.println("====================================");
    }

    public void tampilkanInfoSekolah() {
        System.out.println("Nama Sekolah: Sekolah Coding Indonesia");
        System.out.println("Alamat: Jl. Pemrograman No. 123");
        System.out.println("Telepon: (021) 12345678");
    }

    public void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println("=== BIODATA ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("Kota  : " + kota);
        System.out.println("================");
    }

    public void hitungLuasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("Persegi panjang dengan panjang " + panjang + " cm dan lebar " + lebar + " cm");
        System.out.println("Luas = " + luas + " cm2");
    }

    public void isLoginSuccess(boolean loginStatus) {
        System.out.println("Ini login status usernya " + loginStatus);
    }

    public void hitungKelilingPersegiPanjang(int panjang, int lebar) {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Persegi panjang dengan panjang " + panjang + " cm dan lebar " + lebar + " cm");
        System.out.println("Keliling = " + keliling + " cm");
    }

}
