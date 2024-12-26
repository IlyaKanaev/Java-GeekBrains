// Logger/impl/ConsoleLogger.java
package Logger.impl;

import Logger.Logger;

/**
 * Класс ConsoleLogger реализует интерфейс Logger и предоставляет
 * реализацию логирования в консоль.
 */
public class ConsoleLogger implements Logger {
    /**
     * Выводит лог в консоль с префиксом "Лог: ".
     *
     * @param message Сообщение, которое требуется залогировать.
     */
    @Override
    public void log(String message) {
        // Выводим лог в консоль
        System.out.println("Лог: " + message);
    }
}
