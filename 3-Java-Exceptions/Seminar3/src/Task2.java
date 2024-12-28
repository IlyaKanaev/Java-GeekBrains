/* Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
ужно бросить исключение, если работа с объектом типа счетчик был не в ресурсном try и/или остался открыт. П
одумайте какой тип исключения подойдет лучше всего.
 */
import java.io.*;
import java.io.IOException;
public class Task2 {
    public class Main {
        public static void main(String[] args) throws IOException{
            main2();
        }

        public static void main2() throws IOException{
            try(Task ct = new Task()){
                ct.add();
                ct.add();
                ct.add();
                System.out.println(ct.getCount());
                ct.close();
                ct.add();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

}


class Task implements AutoCloseable {
    private Integer count;

    public Task(){
        this.count = 0;
    }

    public void checkClose() throws IOException{
        if (this.count == null)
            throw new IOException("Экземпляр закрыт!");
    }

    public void add() throws IOException{
        checkClose();
        this.count++;
    }

    public Integer getCount() throws IOException{
        checkClose();
        return this.count;
    }

    @Override
    public void close(){
        this.count = null;
    }
}

