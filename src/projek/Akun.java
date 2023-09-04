package projek;

// Outer Class
public class Akun {
    private String pin;

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pinUser) {
        this.pin = pinUser;
    }

    // Inner Class
    public class SaldoUser {
        private int jumlahSaldo;
        private int tranfer;
        private int tarikTunai;

        public int getJumlahSaldo() {
            return this.jumlahSaldo;
        }

        public void setJumlahSaldo(int jumlahSaldo) {
            this.jumlahSaldo = jumlahSaldo;
        }

        public void setTranfer(int tranfer) {
            this.tranfer = tranfer;
            jumlahSaldo -= this.tranfer;
        }

        public void setTarikTunai(int tarikTunai) {
            this.tarikTunai = tarikTunai;
            jumlahSaldo -= this.tarikTunai;
        }

    }
}
