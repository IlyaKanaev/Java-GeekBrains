package ru.maliutin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* Создаем GsonBuilder для сериализ./десериализ. объектов,
            дополнительно настраиваем методом setPrettyPrinting() для
            более читаемого формата JSON.
        */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Person person = new Person("Ivan", "Ivanov", 25);
        // Проверка работы метода hashCode()
        System.out.println("person hashCode = " + person.hashCode());

        // Сериализуем в JSON
        String gsonFromPerson = gson.toJson(person);
        System.out.println("Объект Person сериализованный в JSON:");
        System.out.println(gsonFromPerson);

        // Десериализуем из JSON
        Person personOfGson = gson.fromJson(gsonFromPerson, Person.class);
        System.out.println("Объект Person десериализованный из JSON:");
        System.out.println(personOfGson);
        System.out.println("person hashCode = " + personOfGson.hashCode());

        // Проверка работы метода equals()
        System.out.println("person == person: " + person.equals(personOfGson));

    }
}
