public class Product extends Goods{
    protected int rating;
    private int status;

    public Product(String name, double price, int rating, int status) {
        super(name, price);
        this.rating = rating;
        this.status = status;
    }
    @Override
    void deleteGood(int amount) {
        this.status -= amount;
    }
    @Override
    void addGood(int amount) {
        this.status += amount;
    }
    @Override
    void showGoods() {
        if(status != 0){
            System.out.println("На прилавке лежит " + super.name + " с рейтингом " + this.rating + " в количестве " + status + " штук");
        } else {
            System.out.println("К сожалению товар закончился.");
        }
    }
    @Override
    public String toString() {
        return name; // Или любая другая строка, представляющая продукт как строку
    }
    public int getStatus() {
        return status;
    }
}
