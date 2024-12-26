// Logger/Logger.java
package Logger;

/**
 * Интерфейс Logger определяет метод log для логирования сообщений.
 */
public interface Logger {
    /**
     * Метод для записи сообщения в лог.
     *
     * @param message Сообщение, которое требуется залогировать.
     */
    void log(String message);
}
