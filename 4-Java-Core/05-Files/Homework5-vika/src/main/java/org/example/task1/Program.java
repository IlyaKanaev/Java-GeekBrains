package org.example.task1;

import java.nio.file.*;
import java.io.*;

/**
 * Написать функцию, создающую резервную копию всех файлов в директории(без
 * поддиректорий) во вновь созданную папку ./backup
 */

public class Program {
    public static void main(String[] args) {
        try {

            Files.createDirectory(Path.of("./backup"));

            DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
            for (Path file : dir) {
                if (Files.isDirectory(file)) continue;
                Files.copy(file, Path.of("./backup/" + file.toString()));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}