package generic;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Data<Integer> number = new Data<Integer>(10);
        Data<String> kata = new Data<String>("Hisyam");

        number.getData();
        number.setData(90);
        number.getData();
        kata.getData();

        /* Convariant */
        Data<String> hallo1 = new Data<String>("Hisyam Arief");

        Data<? extends Object> hallo2 = hallo1;

        hallo2.getData();

        /* ContraVariant */
        Data<Object> hay1 = new Data<Object>(1023);

        Data<? super Double> hay2 = hay1;

        hay2.getData();
        hay2.setData(80.5);
        hay2.getData();
    }
}