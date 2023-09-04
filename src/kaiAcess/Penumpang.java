package kaiAcess;

public class Penumpang {
    /* Instansiasi Indentitas */
    private String username;
    private String password;
    private String namaPenumpang;
    private String NIK;

    /*
     * Getter & Setter Indentitas
     */
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaPenumpang() {
        return this.namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String NIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * Inner Class -- SaldoPenumpang
     */
    public class SaldoPenumpang {
        private int saldo;

        public int getSaldo() {
            return this.saldo;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }
    }
}
