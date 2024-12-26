package gb_oop_java.sem3.cw.bullAndCow;

public interface Game {
    void start( Integer sizeWord, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
