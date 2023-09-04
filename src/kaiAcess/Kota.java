package kaiAcess;

public class Kota extends Kereta {
    @Override
    public void setKodeKereta(String kodeKereta) {
        kodeKereta = getKodeKereta();
    }

    @Override
    public void setNamaKereta(String namaKereta) {
        namaKereta = getNamaKereta();
    }

}
