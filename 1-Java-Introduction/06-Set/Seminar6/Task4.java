/*Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.Убедитесь, что все они сохранились во множество.
Создайте метод public boolean equals(Object o)Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, методдолжен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Создайте метод public int hashCode()который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использоватьObjects.hash(...))
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились 
 */
import java.util.HashSet;
import java.util.Objects;

public class Task4 {
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
    //3.Создайте метод public boolean equals(Object o)
    //Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
    //должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
        @Override
        public boolean equals(Object obj) {
            var t = (Task4) obj;
            return (id == t.id && Objects.equals(name, t.name) && Objects.equals(typeAnimal, t.typeAnimal) && Objects.equals(breed, t.breed) && Objects.equals(masterFIO, t.masterFIO) && telephonNumber == t.telephonNumber);
        }
    //4. Создайте метод public int hashCode()
    //который будет возвращать hash, вычисленный на основе полей класса Cat.
    // (Можно использовать Objects.hash(...))
        @Override
        public int hashCode() {
            return Objects.hash(id, name, typeAnimal, breed, masterFIO, telephonNumber);
        }
}

class CatTest {
        public static void main(String[] args) {
    //1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
    //Поместите в него некоторое количество объектов.
            HashSet<Task4> cats = new HashSet<Task4>();

            Task4 cat1 = new Task4();
            cat1.id = 100;
            cat1.name = "Мурзик";
            cat1.typeAnimal = "кошка";
            cat1.breed = "сиамская";
            cat1.masterFIO = "Иванова Элеонора Венедиктовна";
            cat1.telephonNumber = "89195462538";

            Task4 cat2 = new Task4();
            cat2.id = 101;
            cat2.name = "Мурка";
            cat2.typeAnimal = "кошка";
            cat2.breed = "беспородная";
            cat2.masterFIO = "Васильев Федор";
            cat2.telephonNumber = "8918-568-32-11";

            Task4 cat3 = new Task4();
            cat3.id = 102;
            cat3.name = "Лео";
            cat3.typeAnimal = "кошка";
            cat3.breed = "русская голубая";
            cat3.masterFIO = "Романова Анастасия";
            cat3.telephonNumber = "8926-515-32-13";

            cats.add(cat1);
            cats.add(cat2);
            cats.add(cat3);

    //2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
    //Убедитесь, что все они сохранились во множестве.
    Task4 cat4 = new Task4();   // по параметрам идентичен cat3
            cat4.id = 102;
            cat4.name = "Лео";
            cat4.typeAnimal = "кошка";
            cat4.breed = "русская голубая";
            cat4.masterFIO = "Романова Анастасия";
            cat4.telephonNumber = "8926-515-32-13";

            cats.add(cat4);
            for (Task4 cat : cats) {
                System.out.println(cat);
    //5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились
            }
        }
}