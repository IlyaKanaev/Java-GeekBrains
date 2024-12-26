import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Product item_1 = new Product(100, 1, "Lays", 1);
        Product item_2 = new Product(120, 2, "Nuts", 2);
        Product item_3 = new Product(90, 3, "Chips", 3);
        Product item_4 = new Product(30, 4, "Bread", 4);
        Product item_5 = new Product(60, 5, "Cheese", 5);
        Product item_6 = new Product(150, 6, "Breakers", 6);
        Product item_7 = new Bottle(80, 7, "Cola", 7, 0.5f);
        //Домашнее задание по добавлению напитков
        Product item_8 = new HotDrink(110, 8, "Tea", 8, 0.2f, 75);
        Product item_9 = new HotDrink(130, 9, "Tea", 9, 0.3f, 75);
        Product item_10 = new HotDrink(180, 10, "Tea", 10, 0.5f, 75);
        Product item_11 = new HotDrink(145, 11, "Coffee", 11, 0.2f, 85);
        Product item_12 = new HotDrink(180, 12, "Coffee", 12, 0.3f, 85);
        Product item_13 = new HotDrink(220, 13, "Coffee", 13, 0.5f, 85);

        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display display = new Display();
        List<Product> productList = new ArrayList<>();

        productList.add(item_1);
        productList.add(item_2);
        productList.add(item_3);
        productList.add(item_4);
        productList.add(item_5);
        productList.add(item_6);
        productList.add(item_7);

        //Добавляем вывод новых продуктов
        productList.add(item_8);
        productList.add(item_9);
        productList.add(item_10);
        productList.add(item_11);
        productList.add(item_12);
        productList.add(item_13);


        VendingMachine vm = new VendingMachine(hold, coin, display, productList);

        for (Product p : vm.getAssort()){
            System.out.println(p);
        }

    }
}
