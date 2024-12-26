import java.util.HashMap;
import java.util.Map;

public class Basket{
    private String name;
    private Map<Product, Integer> productsInBasket;

    public Basket(String name) {
        this.name = name;
        this.productsInBasket = new HashMap<>();
    }
    public void addToBasket(int amount, Product product) {
        if (productsInBasket.containsKey(product)) {
            int currentAmount = productsInBasket.get(product);
            productsInBasket.put(product, currentAmount + amount);
        } else {
            productsInBasket.put(product, amount);
        }
    }
    public void deleteFromBasket(Product product, int amount) {
        if (productsInBasket.containsKey(product)) {
            int currentAmount = productsInBasket.get(product);
            if (currentAmount > amount) {
                productsInBasket.put(product, currentAmount - amount);
            } else {
                productsInBasket.remove(product);
            }
        }
    }
    @Override
    public String toString() {
        return "В тележке сейчас лежит: " + productsInBasket;
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getProductsInBasket() {
        return productsInBasket;
    }
}
