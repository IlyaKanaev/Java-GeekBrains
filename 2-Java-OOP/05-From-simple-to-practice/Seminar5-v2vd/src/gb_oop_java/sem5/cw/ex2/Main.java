package gb_oop_java.sem5.cw.ex2;

import gb_oop_java.sem5.cw.ex2.controller.Controller;
import gb_oop_java.sem5.cw.ex2.model.Student;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        Student student = controller.createStudent(new Student("Ivan", "Ivanov", 2001, 1));
        controller.printStudents(student);
        controller.returnStudents();
    }
}
