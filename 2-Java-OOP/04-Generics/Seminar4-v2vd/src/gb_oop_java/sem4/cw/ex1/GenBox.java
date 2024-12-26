package gb_oop_java.sem4.cw.ex1;

public class GenBox <T>{
    private T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}