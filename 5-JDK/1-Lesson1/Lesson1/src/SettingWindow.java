import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    // размеры
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;

    // класс из одной кнопки
    private JButton btnStart;

    // в конструкторе класса - инициализация кнопки
    SettingWindow(GameWindow gameWindow){
        btnStart = new JButton("Start new game");
        // в параметрах - расположение относительно стартового окна, GameWindow
        setLocationRelativeTo(gameWindow);
        // установка размеров
        setSize(WIDTH, HEIGHT);
        // слушатель нажатий
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // при нажатии кнопки Start передаются, в данном случае, константы:
                // mode = 0, размеры игрового поля 3х3, 3 в ряд - для победы
                gameWindow.startNewGame(0, 3, 3, 3);
            }
        });
        // ну и кнопка добавляется на панельку, т.е. вся панелька - это одна кнопка
        add(btnStart);
    }
}
