package oop.st4tic;

public class Hello {
    public final int a = 3;
    public static final int b = 5;

    public static void hallo(String nama) {
        System.out.println("This is static Method," + nama);
    }

    public void helloNonStatic() {
        System.out.println("This is non Static Method");
    }

    /**
     * InnerHello
     */
    public static class InnerHello {
        private String nama;

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return this.nama;
        }

    }
}
