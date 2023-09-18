package generic;

/**
 * Data
 */
public class Data<T> {
    private T data;

    Data(T data){
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        System.out.println(this.data);
        return this.data;
    }
}