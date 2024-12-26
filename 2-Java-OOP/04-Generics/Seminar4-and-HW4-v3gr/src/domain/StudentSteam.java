package domain;

import domain.GroupeIterator;
import domain.StudentGroup;
/**
 * Класс который создаёт поток из групп студентов
 * private int steamId - идентификатор потока
 * private List<StudentGroup> listGroup - список групп студентов
 */

import java.util.*;

public class StudentSteam implements Iterable<StudentGroup> {
    private int steamId;
    private List<StudentGroup> listGroup;

    // Конструктор класса, принимает идентификатор потока
    public StudentSteam(int steamId) {
        this.steamId = steamId;
        this.listGroup = new ArrayList<>();
    }

    // Метод добавления группы в поток
    public void addStudentGroup(StudentGroup group) {
        listGroup.add(group);
    }

    // Методы установки/вывода полей класса
    public int getSteamId() {
        return steamId;
    }

    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    public List<StudentGroup> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<StudentGroup> listGroup) {
        this.listGroup = listGroup;
    }
    // Добавляем метод для сортировки групп в потоке по количеству студентов
    public void sortGroupsByNumberOfStudents() {
        Collections.sort(listGroup, new Comparator<StudentGroup>() {
            @Override
            public int compare(StudentGroup group1, StudentGroup group2) {
                // Сначала сравниваем по количеству студентов
                int compareByStudents = Integer.compare(group1.getList().size(), group2.getList().size());
                if (compareByStudents != 0) {
                    return compareByStudents;
                }

                // Если количество студентов одинаково, сравниваем по идентификатору группы
                return Integer.compare(group1.getId(), group2.getId());
            }
        });
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupeIterator(listGroup);
    }

    // Переопределение метода toString для вывода информации о потоке студентов
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Поток студентов. Номер потока=").append(steamId).append("\n");
        for (StudentGroup group : listGroup) {
            result.append(group.toString());
        }
        return result.toString();
    }

}
