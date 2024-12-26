// Logger/impl/FileLogger.java
package Logger.impl;

import Logger.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс FileLogger реализует интерфейс Logger и предоставляет
 * реализацию логирования в файл.
 */
public class FileLogger implements Logger {
    private File logFile;

    /**
     * Конструктор FileLogger.
     *
     * @param filePath Путь к файлу лога.
     */
    public FileLogger(String filePath) {
        this.logFile = new File(filePath);
        // Инициализация лог-файла и другие необходимые действия
    }

    /**
     * Выводит лог в файл.
     *
     * @param message Сообщение, которое требуется залогировать.
     */
    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();  // Обработка ошибок записи в файл
        }
    }
}
