import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;

public class Map extends JPanel {
    private static final Random RANDOM = new Random();
    // числовые значения 1, 2, 0 будут использованы в дальнейшем
    // для определения статуса, кто какую фигуру поставил
    // 1 - человек какую-то свою фигуру поставил
    private static final int HUMAN_DOT = 1;
    // 2 - Искусственный Интеллект туда сходил
    private static final int AI_DOT = 2;
    // 0 - ничего не стоит
    private static final int EMPTY_DOT = 0;
    // отступы, используются при рисовании
    private static final int PADDING = 10;

    // состояние игры (кто победил либо уже закончили игру)
    private int gameStateType;
    // константы для записи в переменную gameStateType
    private static final int STATE_GAME = 0; // игра
    private static final int STATE_WIN_HUMAN = 1; // победил человек
    private static final int STATE_WIN_AI = 2; // победил ИИ
    private static final int STATE_DRAW = 3; // ничья

    // сообщения для всех состояний игры
    private static final String MSG_WIN_HUMAN = "Победил игрок!";
    private static final String MSG_WIN_AI = "Победил компьютер!";
    private static final String MSG_DRAW = "Ничья!";

    // переменные ширины, высоты, количество ячеек по ширине и высоте
    private int width, height, cellWidth, cellHeight;
    // переменные - mode (в данном случае не используется)
    // размеры ячеек по X и Y, необходимое кол-во подряд идущих значений для победы
    private int mode, fieldSizeX, fieldSizeY, winLen;
    // массив, в котором будут храниться значения констант, кто куда сходил:
    // HUMAN_DOT, AI_DOT, EMPTY_DOT
    private int[][] field;
    // флажок, обозначающий, что игра еще не закончена
    private boolean gameWork;

    // конструктор класса
    Map() {
        // устанавливаем цвет фона
        setBackground(Color.WHITE);
        // добавляем слушатель нажатий по нажатию мышки
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (gameWork) {
                    // если игра продолжается - делаем update передавая в него
                    // параметр e - т.е. event, который содержит, что произошло и координаты нажатия
                    update(e); // описание метода - смотрите ниже
                }
            }
        });
    }

    // метод создания массива для хранения "крестиков" и "ноликов"
    // изначально он заполнен нулями т.е. EMPTY_DOT
    private void initMap() {
        field = new int[fieldSizeY][fieldSizeX];
    }

    // метод начала игры из GameWindow. в GameWindow эти два метода вызывают друг друга
    // и попадают сюда. Здесь мы сохраняем наши поля для использования
    void startNewGame(int mode, int sizeX, int sizeY, int winLen) {
        this.mode = mode;
        this.fieldSizeX = sizeX;
        this.fieldSizeY = sizeY;
        this.winLen = winLen;

        // создаем новое игровое поле
        initMap();
        gameWork = true; // игра пошла
        gameStateType = STATE_GAME; // устанавливаем состояние - игра идет

        repaint(); // вызываем метод отрисовки (Смотрите ниже)
    }

    private void update(MouseEvent mouseEvent) {
        // достаем из переданного ивента e координаты того, куда нажали
        // поделив координаты на количество ячеек - вычислим, в какую ячейку произошел щелчок
        int x = mouseEvent.getX() / cellWidth;
        int y = mouseEvent.getY() / cellHeight;
        // проверка на попадание в ячейку (в нужный диапазон)
        if (!isValidCell(x, y) || !isEmptyCell(x, y)) {
            // если попадания нет или ячейка непустая
            // - то программа не реагирует на щелчки мыши
            return;
        }
        // если проверка прошла удачно - в ячейку записывается ход игрока (1)
        field[y][x] = HUMAN_DOT;
        // проверяется на конец игры
        if (checkEndGame(HUMAN_DOT, STATE_WIN_HUMAN)) {
            return;
        }
        aiTurn(); // ход делает ИИ
        repaint(); // снова перерисовка
        checkEndGame(AI_DOT, STATE_WIN_AI); // снова проверка на конец игры
    }

    // метод выводит состояние ячеек массива. использровался для дебага
    private void testBoard(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        System.out.println();
    }

    // метод проверки что координаты лежат в нужных пределах (ячейки?)
    private boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }
    // проверка, щелкнул ли игрок в пустую ячейку
    private boolean isEmptyCell(int x, int y) {
        return field[y][x] == EMPTY_DOT;
    }

    // ход Искуственного Интеллекта
    private void aiTurn() {
        int x, y;
        do { // рандом много раз, пока случайно не попадет в пустую ячейку
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = AI_DOT; // этой пустой ячейки присваивается ход ИИ
    }

    // проверка на полностью заполненное поле (ничья)
    private boolean isMapFull() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    // метод проверки на конец игры
    private boolean checkEndGame(int dot, int gameOverType) {
        // проверка на "победа уже"
        if (checkWin(dot)) {
            // меняем статус состояния на gameOverType (игра окончена)
            this.gameStateType = gameOverType;
            // делаем перерисовку
            repaint();
            // возвращаем true, как результат проверки конца игры
            return true;
        } else if (isMapFull()) { // вариант полностью заполненного поля (ничья)
            this.gameStateType = STATE_DRAW;
            repaint();
            return true;
        }
        return false; // игра не закончена
    }

    // метод проверки на победу
    private boolean checkWin(int dot){
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLen, dot)) return true;
                if (checkLine(i, j, 1, 1, winLen, dot)) return true;
                if (checkLine(i, j, 0, 1, winLen, dot)) return true;
                if (checkLine(i, j, 1, -1, winLen, dot)) return true;
            }
        }
        return false;
    }

    // проверка на "три в ряд". принимает начальные координаты и следующие ячейки
    // len - требуемая длина цепочки, dot - чьи ходы проверяем
    private boolean checkLine(int x, int y, int vx, int vy, int len, int dot){
        // находим координаты следующей ячейки
        int far_x = x + (len - 1) * vx;
        int far_y = y + (len - 1) * vy;
        // проверяем, что следующая ячейка лежит на игровом поле
        if (!isValidCell(far_x, far_y)){
            return false;
        }
        // проверка ячеек в линии на принадлежность к dot (человек или ИИ)
        for (int i = 0; i < len; i++) {
            if (field[y + i * vy][x + i * vx] != dot){
                // если какая-то ячейка в линии разрывает последовательность - то false
                return false;
            }
        }
        return true;
    }

    // метод, связанный с вызовом метода repaint()
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // если игра еще идет - то мы ее перерисовываем
        if (gameWork) {
            render(g);
        }
    }

    private void render(Graphics g) {
        width = getWidth();
        height = getHeight();
        cellWidth = width / fieldSizeX;
        cellHeight = height / fieldSizeY;

        g.setColor(Color.BLACK);
        for (int h = 0; h < fieldSizeY; h++) {
            int y = h * cellHeight;
            g.drawLine(0, y, width, y);
        }
        for (int w = 0; w < fieldSizeX; w++) {
            int x = w * cellWidth;
            g.drawLine(x, 0, x, height);
        }

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == EMPTY_DOT){
                    continue;
                }
                if (field[y][x] == HUMAN_DOT) {
                    g.drawLine(x * cellWidth + PADDING, y * cellHeight + PADDING,
                            (x + 1) * cellWidth - PADDING, (y + 1) * cellHeight - PADDING);
                    g.drawLine(x * cellWidth + PADDING, (y + 1) * cellHeight - PADDING,
                            (x + 1) * cellWidth - PADDING, y * cellHeight + PADDING);
                } else if (field[y][x] == AI_DOT) {
                    g.drawOval(x * cellWidth + PADDING, y * cellHeight + PADDING,
                            cellWidth - PADDING * 2, cellHeight - PADDING * 2);
                } else {
                    throw new RuntimeException("unchecked value " + field[y][x] +
                            " in cell: x=" + x + " y=" + y);
                }
            }
        }
        if (gameStateType != STATE_GAME){
            showMessage(g);
        }
    }

    private void showMessage(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, getHeight() / 2, getWidth(), 70);
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Times new roman", Font.BOLD, 48));
        switch (gameStateType){
            case STATE_DRAW -> g.drawString(MSG_DRAW, 180, getHeight() / 2 + 60);
            case STATE_WIN_HUMAN -> g.drawString(MSG_WIN_HUMAN, 20, getHeight() / 2 + 60);
            case STATE_WIN_AI -> g.drawString(MSG_WIN_AI, 70, getHeight() / 2 + 60);
            default -> throw new RuntimeException("Unchecked gameOverState: " + gameStateType);
        }
        gameWork = false;
    }
}
