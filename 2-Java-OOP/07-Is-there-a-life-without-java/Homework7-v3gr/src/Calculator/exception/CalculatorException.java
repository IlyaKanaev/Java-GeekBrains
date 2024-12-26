// Calculator/exception/CalculatorException.java
package Calculator.exception;

/**
 * Исключение, которое может быть выброшено при ошибках в работе калькулятора.
 */
public class CalculatorException extends Exception {
    /**
     * Конструктор, принимающий сообщение об ошибке.
     *
     * @param message Сообщение об ошибке.
     */
    public CalculatorException(String message) {
        // Вызываем конструктор суперкласса (Exception) с переданным сообщением
        super(message);
    }
}
