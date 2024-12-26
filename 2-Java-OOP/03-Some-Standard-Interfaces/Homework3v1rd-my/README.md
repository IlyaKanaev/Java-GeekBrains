### Условие

1. Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo()

   подсказка: можно добавить, а можно не добавлять в класс поля;

   подсказка: делать сортировку по параметру, power в Component, но как-то по другому


2. Создать несколько экземпляров Pharmacy, добавить их в ArrayList, написать метод, выводящий Pharmacy в отсортированном виде.

- (усложненное, не обязательное) Постараться написать еще 1 метод сортировки лекарств, но уже по другому параметру

  подсказка - в метод Collections.sort в качестве второго параметра добавить лямбду, причем развернутую в сложный блок кода

  ```java
  public class Main {
      static List<Integer> integers = new ArrayList<>();
      public static void main(String[] args) {
          integers.add(5);
          integers.add(1);
          integers.add(14);
          integers.add(-1);
          integers.add(11);
  
          Collections.sort(integers);
          System.out.println(integers);
  
          Collections.sort(integers, (a, b) -> {
              // тут наша лябда должна быть
          })
      }
  }
  ```
  
Мои комментарии к решению:
Убрал лишние классы. Сортировка по сумме power компонентов Для этого в классе Pharmacy добавил метод allPowers Как не делать его статическим пок