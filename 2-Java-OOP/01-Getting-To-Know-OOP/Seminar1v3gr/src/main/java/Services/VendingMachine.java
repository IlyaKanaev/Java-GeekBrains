package Services;

import Domain.Product;
import java.util.List;

public class VendingMachine {
    private Holder hold;
    private CoinDispenser coin;
    private Display display;
    private List<Product> assort;

    //Конструктор
    public VendingMachine(Holder hold, CoinDispenser coin, Display display, List<Product> assort) {
        this.hold = hold;
        this.coin = coin;
        this.display = display;
        this.assort = assort;
    }
    //Методы


    public void buyProduct(){

    }
    public void releaseProduct(){

    }
    public Holder getHold() {
        return hold;
    }

    public void setHold(Holder hold) {
        this.hold = hold;
    }

    public CoinDispenser getCoin() {
        return coin;
    }

    public void setCoin(CoinDispenser coin) {
        this.coin = coin;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Product> getAssort() {
        return assort;
    }

    public void setAssort(List<Product> assort) {
        this.assort = assort;
    }
}