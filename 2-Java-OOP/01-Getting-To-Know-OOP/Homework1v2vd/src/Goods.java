public abstract class Goods {
    protected String name;
    protected double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void deleteGood(int amount);
    abstract void addGood(int amount) ;
    abstract void showGoods();
    public String getNameGood(){
        return name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
