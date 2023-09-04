package oop.innerKls;

public class Company {
    private String nama;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public class Employe {
        private String nama;

        public String getCompany() {
            return Company.this.nama;
        }

        public String getNmaa() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }
}
