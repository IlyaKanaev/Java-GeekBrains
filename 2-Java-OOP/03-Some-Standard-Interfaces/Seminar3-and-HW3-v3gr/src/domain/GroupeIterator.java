package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, переопределяющий метод итерации объектов класса StudentSteam
 */
public class GroupeIterator implements Iterator<StudentGroup> {
    private int count;
    private List<StudentGroup> StudentGroup;

    public GroupeIterator(List<domain.StudentGroup> studentGroup) {
        StudentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return this.count < StudentGroup.size();
    }

    @Override
    public StudentGroup next() {
        int index = count;
        count++;
        return StudentGroup.get(index);
    }
}
