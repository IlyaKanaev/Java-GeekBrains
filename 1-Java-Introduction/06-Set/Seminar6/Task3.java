/*Продумайте структуру класса Кот
Какие поля и методы будут актуальны дляприложения, которое являетсяа) информационной системой ветеринарной клиникиб) архивом выставки котовв) информационной системой Театра кошек Ю. Д. КуклачёваМожно записать в текстовом виде, не обязательно реализовывать в java.
Реализуйте 1 из вариантов класса Cat из предыдущего задания, можноиспользовать не все придуманные поля и методы. Создайте несколькоэкземпляров этого класса, выведите их в консоль.
Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилас
 */
public class Task3 {
    int id;
    String name;
    String typeAnimal;
    String breed;
    String masterFIO;
    String telephonNumber;

    @Override
    public String toString() {

        return String.format("id:%d name:%s type:%s breed:%s master:%s tel:%s", id, name, typeAnimal, breed, masterFIO, telephonNumber);
    }
}
class CatTest{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 100;
        cat1.name = "Мурзик";
        cat1.typeAnimal = "кошка";
        cat1.breed = "сиамская";
        cat1.masterFIO = "Иванова Элеонора Венедиктовна";
        cat1.telephonNumber = "89195462538";

        Cat cat2 = new Cat();
        cat2.id = 101;
        cat2.name = "Мурка";
        cat2.typeAnimal = "кошка";
        cat2.breed = "беспородная";
        cat2.masterFIO = "Васильев Федор";
        cat2.telephonNumber = "8918-568-32-11";

        Cat cat3 = new Cat();
        cat3.id = 102;
        cat3.name = "Лео";
        cat3.typeAnimal = "кошка";
        cat3.breed = "русская голубая";
        cat3.masterFIO = "Романова Анастасия";
        cat3.telephonNumber = "8926-515-32-13";

        System.out.println(cat1.toString());
    }
}