package services;
import java.util.ArrayList;
import java.util.List;

import domain.Employer;
import domain.PersonComparator;


public class EmployerService implements iPersonService<Employer> {
    private int count;
    private List<Employer> employer;
    public EmployerService(){
        employer = new ArrayList<>();
    }

    @Override
    public List<Employer> getAll() {
        return employer;
    }

    @Override
    public void create(String name, int age) {
        Employer emp = new Employer(name, age, "разнорабочий");
        count++;
        employer.add(emp);
        sortByFIO();
    }
    public void sortByFIO(){
        PersonComparator<Employer> emCom = new PersonComparator<>();
        employer.sort(emCom);
    }
}