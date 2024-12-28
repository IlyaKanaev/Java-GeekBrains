/* 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
2. Создайте класс исключений, который будет возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, который будет возникать при попытке открыть несуществующий файл.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class Task3 {

    public static void main(String[] args) throws FileExist {
        throw new FileExist();
    }
}

class DivByZeroException extends ArithmeticException {
    public DivByZeroException() {
        super("Division by zero is not support");
    }
}

class EmptyArrayElement extends NullPointerException {
    public EmptyArrayElement(int idx) {
        super(String.format("Element with index %d not found", idx));
    }

    public EmptyArrayElement() {
        super("Element not found");
    }
}

class FileExist extends FileNotFoundException {
    public FileExist(String path) {
        super(String.format("File %s is not exist", path));
    }

    public FileExist() {
        super("File is not exist");
    }
}