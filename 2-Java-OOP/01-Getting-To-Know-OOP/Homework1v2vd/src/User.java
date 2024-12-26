public class User{
    protected String username;
    protected String password;
    protected Basket basket;

    public User(String username, String password, Basket basket) {
        this.username = username;
        this.password = password;
        this.basket = basket;
    }
    public String getUsername() {
        return username;
    }
    public void getBasket() {
        System.out.println("В тележке " + this.username + " лежит: " + this.basket.getProductsInBasket());
    }
}
