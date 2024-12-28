/* - Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
(тело самогометода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
*/
import java.io.IOException;
public class Task1 {
    public class Main {
        public static void main(String[] args) {
            try {
                doSomething();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        public static void doSomething() throws IOException {

        }
    }
}
