package standarClass;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        String name = "Hisyam Arief Zulfani";
        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();

        System.out.println(name);
        System.out.println(nameUpper);
        System.out.println(nameLower);

        BigInteger a = new BigInteger("1000000000000000");
        BigInteger b = new BigInteger("1000000000000000");
        BigInteger result = a.add(b);

        System.out.println(result);
    }
}
