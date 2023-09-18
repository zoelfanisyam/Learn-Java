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

        
        
    }
}