package org.example;
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.getAngka());
        System.out.println(obj.getNilaiDouble());
        System.out.println(obj.getHuruf());
        System.out.println(obj.isLogin());
        System.out.println(obj.getNama());
    }

    public int getAngka() {
        return 10;
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
}
