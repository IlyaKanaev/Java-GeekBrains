package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, переопределяющий итерацию объектов группы студентов
 */

public class StudentIterator implements Iterator<Student> {
    private int count;
    private List<Student> list;

    public StudentIterator(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public Student next() {
        int index = count;
        count++;
        return list.get(index);
    }
}
