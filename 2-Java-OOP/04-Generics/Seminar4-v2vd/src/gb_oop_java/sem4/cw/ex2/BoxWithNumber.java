package gb_oop_java.sem4.cw.ex2;

public class BoxWithNumber <T extends Number>{
    private T[] arr;

    private double average(){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();
        }
        return sum/arr.length;
    }

    public boolean compareAverage(BoxWithNumber<?> boxWithNumber){
        return this.average() > boxWithNumber.average();
    }

    public BoxWithNumber(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}
