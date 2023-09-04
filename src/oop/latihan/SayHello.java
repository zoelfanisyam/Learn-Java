package oop.latihan;

public class SayHello {
    private int uang;

    public int getUang() {
        if (uang < 10) {
            System.out.println("Uang mu tidak cukup ya,....");
        } else {
            System.out.println("Transaksi kamu berhasil");
        }
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }
}
