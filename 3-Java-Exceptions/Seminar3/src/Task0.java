/* Перепишите следующий код, используя ресурсный try
public void rwLine(Path pathRead, Path pathWrite) throws IOException {
    BufferReader in = null;
    BufferReader out = null;
    try {
        in = Files.newBufferedReader(pathRead);
        out = Files.newBufferedWriter(pathWrite);
        out.write(in.readLine());
    } finally {
        try {
            if (in != null) in.close();
        } catch (IOException e) {

        }
        try {
            if (out != null) out.close();
        } catch (IOException e) {

        }
    }
}
 */
public class Task0 {
}
