package gb_oop_java.sem3.cw.bullAndCow;

import gb_oop_java.sem2.cw.ex5.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        numberGame.start(4, 6);
        Scanner scanner = new Scanner(System.in);
        while (numberGame.getGameStatus().equals(GameStatus.ACTIVE)) {
            Answer answer = numberGame.inputValue(scanner.nextLine());
            System.out.println(answer);
        }
        if (numberGame.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Победа!!");
        } else {
            System.out.println("Проигрыш!");
        }
    }
}
