import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    // размеры
    private static final int WIDTH = 555;
    private static final int HEIGHT = 507;

    // виджеты (наши кнопочки плюс объект map, отвечающий за игру)
    private JButton btnStart, btnExit;
    private SettingWindow settingWindow;
    private Map map;

    // конструктор класса
    GameWindow(){
        // задаем значение закрытия приложения по нажатию на крестик
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // установка размеров
        setSize(WIDTH, HEIGHT);
        // метод, чтобы экран появлялся по центру экрана,
        // а не относительно какого-то объекта
        setLocationRelativeTo(null);

        // заголовок
        setTitle("TicTacToe");
        // возможность изменения размера
        setResizable(false);
        // инициализация кнопок. Дали им стартовые названия
        // (текст, который будет написан на этих кнопках)
        btnStart = new JButton("New Game");
        btnExit = new JButton("Exit");
        // появляется еще один класс, SettingWindow, которому
        // мы передаем this, т.е. ссылку на текущий объект GameWindow
        settingWindow = new SettingWindow(this);
        // создается map
        map = new Map();

        // создаются обработчики нажатия для каждой из кнопок
        // т.е. вызываем метод addActionListener() и внутри
        // создаем анонимный класс, который реализует интерфейс ActionListener
        // в этом классе переопределяем метод actionPerformed на закрытие
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // здесь переопределенный метод actionPerformed делает видимым
        // наше окно настроек
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        // создаем панельки, на которых размещаются кнопки (одна строчка, две колонки)
        // т.е. добавив два объекта - они расположатся в одну линию
        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);

        // саму панельку добавляем вниз (на "юг")
        add(panBottom, BorderLayout.SOUTH);
        // добавляем нашу игру map в центр (по умолчанию)
        add(map);

        // после всех настроек делаем видимым
        setVisible(true);
    }

    // единственный метод класса с аргументами mode, размерами
    // и длина необходимая для выигрыша
    void startNewGame(int mode, int sizeX, int sizeY, int winLen){
        map.startNewGame(mode, sizeX, sizeY, winLen);
    }
}
