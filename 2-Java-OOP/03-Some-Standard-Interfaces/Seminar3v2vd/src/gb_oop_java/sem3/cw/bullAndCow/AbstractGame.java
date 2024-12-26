package gb_oop_java.sem3.cw.bullAndCow;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private Integer sizeWord;
    private Integer maxTry;
    private GameStatus status;
    private String word;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        status = GameStatus.ACTIVE;
        word = generateWord(sizeWord);
        System.out.println(word);
    }

    private String generateWord(Integer sizeWord) {
        List<String> alf = generateCharList();
        String resultWord = "";
        for (int i = 0; i < sizeWord; i++) {
            Integer ind = new Random().nextInt(alf.size());
            resultWord += alf.get(ind);
            alf.remove(ind);
        }
        return resultWord;
    }

    protected abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        Integer countBull = 0;
        Integer countCow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(((Character) (value.charAt(i))).toString())) {
                countCow++;
                if (value.charAt(i) == word.charAt(i)) {
                    countBull++;
                }
            }
        }
        if (countBull.equals(word.length())) {
            status = GameStatus.WIN;
            return new Answer(maxTry, countBull, countCow);
        }
        if (maxTry == 0) {
            status = GameStatus.LOSE;
            return new Answer(maxTry, countBull, countCow);
        }
        return new Answer(maxTry, countBull, countCow);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }
}