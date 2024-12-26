package gb_oop_java.sem5.cw.ex2.controller;

import gb_oop_java.sem5.cw.ex2.model.Student;
import gb_oop_java.sem5.cw.ex2.model.User;
import gb_oop_java.sem5.cw.ex2.service.UserService;
import gb_oop_java.sem5.cw.ex2.view.StudentView;

import java.util.List;

public class Controller {
    private UserService userService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student){
        return (Student)userService.create(student);
    }
    public void printStudents(Student student){
        studentView.printStudent(student);
    }
    public List<User> returnStudents(){
        return userService.read();
    }
}
