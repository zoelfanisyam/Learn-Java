package kaiAcess;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Objek Penumpang dan Saldo */
        Penumpang penumpang1 = new Penumpang();
        penumpang1.setUsername("Hisyam@");
        penumpang1.setPassword("12Mei2002");
        penumpang1.setNamaPenumpang("Hisyam Arief Zulfani");
        penumpang1.setNIK("3201071205020002");

        Penumpang.SaldoPenumpang saldoHisyam = penumpang1.new SaldoPenumpang();
        saldoHisyam.setSaldo(1000);

        /* Objek Stasiun */
        ArrayList<String> stasiun = new ArrayList<String>();
        stasiun.add("Jakarta");
        stasiun.add("Cikarang");
        stasiun.add("Purwakarta");
        stasiun.add("Bandung");
        System.out.println(stasiun);

        /* Objek Rute */

        /* Rute 1 */

        /* Menu Login */
        System.out.print("Username : ");
        String inputUsername = input.nextLine();
        System.out.print("Password : ");
        String inputPassword = input.nextLine();
        if (inputUsername.equals(penumpang1.getUsername())) {
            if (inputPassword.equals(penumpang1.getPassword())) {
                System.out.println("Hallo Password");
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username Salah");
        }

    }
}
