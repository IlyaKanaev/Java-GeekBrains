public class Category{
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
    public void showCategory(){
        System.out.print("В категории " + this.name + " лежат продукты: ");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + " в количестве " + products[i].getStatus());
            if (i < products.length - 1) {
                System.out.print(", ");
            }
            System.out.print("\n");
        }
    }
}
