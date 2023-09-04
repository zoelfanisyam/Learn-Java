package kaiAcess;

public abstract class Kereta {
    private String kodeKereta;
    private String namaKereta;
    Rute rute;

    public String getKodeKereta() {
        return this.kodeKereta;
    };

    public String getNamaKereta() {
        return this.kodeKereta;
    };

    public abstract void setKodeKereta(String kodeKereta);

    public abstract void setNamaKereta(String namaKereta);

}
