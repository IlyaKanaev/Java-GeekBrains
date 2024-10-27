/*
Условие:
Создать проект с использованием Maven или Gradle,
добавить в него несколько зависимостей и написать код, использующий эти зависимости.

Пример решения:
1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import myapp.Person;

public class App {
    public static void main(String[] args) {

        // создаем объект Person
        Person person1 = new Person("Ivan", "Fedorov", 37);
        Person person2 = new Person("Elena", "Kovaleva", 25);
        Person person3 = new Person("Dima", "Semenov", 19);

        // создаем объект Gson
        Gson gson1 = new Gson();
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting();
        Gson gson3 = gsonBuilder.create();

        // сериализуем объект класса Person в JSON-формат, получаем в виде строки
        String personToJson1 = gson1.toJson(person1);
        String personToJson2 = gson2.toJson(person2);
        String personToJson3 = gson3.toJson(person3);

        // десериализуем строку в формате JSON в объект класса Person
        Person JsonToPerson1 = gson1.fromJson(personToJson1, Person.class);

        // выводим результат для проверки сериализации в JSON
        System.out.printf("Simple JSON: %s\n", personToJson1);
        System.out.printf("\nPretty JSON: %s\n", personToJson2);
        System.out.printf("\nJSON without expose field: %s\n", personToJson3);

        // проверяем объекты исходный и тот что после десериализации
        System.out.printf("\nperson1 equals JsonToPerson1: %s\n", person1.equals(JsonToPerson1));

        // объект после десериализации
        System.out.println(person1);
    }
}
