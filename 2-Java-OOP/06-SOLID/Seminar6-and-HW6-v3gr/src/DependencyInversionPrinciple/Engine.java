package DependencyInversionPrinciple;

/**
 * Интерфейс Engine представляет собой общий интерфейс для всех типов двигателей.
 * Содержит метод start(), который должен быть реализован в каждом классе-двигателе.
 */

public interface Engine {
    void start();
}
