package oop.innerKls.latihan;

import oop.innerKls.Company;

public class Toping {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public class SubTopping {
        private String nama;

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return Toping.this.getNama() + this.nama;
        }
    }

}
