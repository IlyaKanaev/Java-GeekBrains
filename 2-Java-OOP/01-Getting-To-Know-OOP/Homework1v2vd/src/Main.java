public class Main {
    public static void main(String[] args) {
//      Создали продукты
        Product milkOne = new Product("Молочкофф",59.99, 8, 20);
        Product milkTwo = new Product("Изба на хуторе", 120.00, 6, 25);
        Product sausageOne = new Product("Отчим смог", 170.01, 7, 30);
        Product sausageTwo = new Product("Каждый час", 80.49, 3, 40);
        Product breadOne = new Product("Бородинский", 49.49, 8, 50);

//      Показали информацию о продуктце
        milkOne.showGoods();

//      Создали массив продуктов для категорий
        Product[] milkProducts = {milkOne, milkTwo};
        Product[] sausageProducts = {sausageOne, sausageTwo};
        Product[] breadProducts = {breadOne};

//      Добавили в категории продукты
        Category milk = new Category("Молоко", milkProducts);
        Category sausage = new Category("Сосиски", sausageProducts);
        Category bread = new Category("Хлеб", breadProducts);

//      Показали информацию о магазине
        System.out.println("---Товар в нашем магазине ---");
        milk.showCategory();
        sausage.showCategory();
        bread.showCategory();

//      Создали тележки для покупателей
        Basket cartOne = new Basket("Тележка1");
        Basket cartTwo = new Basket("Тележка2");
        Basket cartThree = new Basket("Тележка3");

        System.out.println("---Подготовили и проверили тележки для покупателей---");
        System.out.println(cartOne);
        System.out.println(cartTwo);
        System.out.println(cartThree);


//      Создали покупателей
        User Ivan = new User("Ivan", "qwerty", cartOne);
        User Liza = new User("Liza", "1234", cartTwo);
        User Mark = new User("Mark", "1234", cartThree);

//      Покупатели стали набирать товары
        System.out.println("---Покупатели стали набирать товары---");
        milkOne.deleteGood(5);
        cartOne.addToBasket(5, milkOne);
        System.out.println(cartOne);

        sausageOne.deleteGood(2);
        cartTwo.addToBasket(2, sausageOne);
        System.out.println(cartTwo);

//      Итоговая информация о покупках и об оставшихся продуктах на прилавках
        System.out.println("---Итого покупки: Ivan---");
        Ivan.getBasket();
        System.out.println("---Итого покупки: Liza---");
        Liza.getBasket();
        System.out.println("---Итого покупки: Mark---");
        Mark.getBasket();
        System.out.println("---Оставшийся товар в магазине---");
        milk.showCategory();
        sausage.showCategory();
        bread.showCategory();
    }
}
