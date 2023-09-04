package projek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Akun Objek
        Akun hisyam = new Akun();
        hisyam.setPin("123050");

        // Saldo Akun
        Akun.SaldoUser saldoHisyam = hisyam.new SaldoUser();
        saldoHisyam.setJumlahSaldo(1000);

        // Login
        int i = 0;
        do {
            System.out.println("Your PIN");
            String inputUserPin = input.nextLine();

            // Menu ATM
            if (hisyam.getPin().equals(inputUserPin)) {
                String transaksiLagi;
                do {
                    System.out.println("Menu :");
                    System.out.println("1. Show Saldo");
                    System.out.println("2. Transfer");
                    System.out.println("3. Tarik Tunai");
                    int inputMenu = input.nextInt();

                    // Pilihan Menu ATM
                    switch (inputMenu) {
                        case 1:
                            System.out.println(saldoHisyam.getJumlahSaldo());
                            break;
                        case 2:
                            System.out.println("Masukan Jumlah transfer");
                            int tranfer = input.nextInt();
                            saldoHisyam.setTranfer(tranfer);
                            System.out.println("Tranfer Berhasil");
                            System.out.println("Saldo anda tersisa " + saldoHisyam.getJumlahSaldo());
                            break;
                        case 3:
                            System.out.println("Masukan Jumlah transfer");
                            int tarikTunai = input.nextInt();
                            saldoHisyam.setTarikTunai(tarikTunai);
                            System.out.println("Tarik Berhasil");
                            System.out.println("Saldo anda tersisa " + saldoHisyam.getJumlahSaldo());
                            break;
                        default:
                            break;
                    }

                    // Kenapa objek Scanner itu harus dibuat lagi dalam scope do while ini? Pr
                    Scanner inputnew = new Scanner(System.in);
                    System.out.println("Transaksi Lagi y/n?");
                    transaksiLagi = inputnew.nextLine();

                } while (transaksiLagi.equals("y"));
                break;
            } else {
                System.out.println("Pin Salah");
                i++;
            }
        } while (i < 3);
    }
}
