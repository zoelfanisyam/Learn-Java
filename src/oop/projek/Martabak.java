package oop.projek;

public abstract class Martabak {
    private String nama;

    public abstract void topping();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
