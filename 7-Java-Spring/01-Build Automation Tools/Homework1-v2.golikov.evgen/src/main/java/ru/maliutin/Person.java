package ru.maliutin;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Класс объекта Person.
 */
public class Person {
    /**
     * Имя.
     */
    private String firstName;
    /**
     * Фамилия.
     */
    private String lastName;
    /**
     * Возраст.
     */
    private int age;

    /**
     * Конструктор класса.
     * @param firstName имя.
     * @param lastName фамилия.
     * @param age возраст.
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Переопределение метода toString().
     * @return строку с представлением объекта.
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Сравнение объектов.
     * @param obj объект для сравнения.
     * @return булево значение.
     */
    @Override
    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(obj, this);
    }

    /**
     * Получение хэш кода объекта.
     * @return хэш код.
     */
    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
