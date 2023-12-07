package GroupG119.sprintTask.sprintTask3_1.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 7l;

    static {
        students.add(new Student(1l, "Kazbek", "kulmuhammed", 75, "B"));
        students.add(new Student(2l, "Amirkhan", "Ramazan", 74, "C"));
        students.add(new Student(3l, "Escenderov", "Adlet", 91, "A"));
        students.add(new Student(4l, "Kinyat", "Aydin", 54, "D"));
        students.add(new Student(5l, "Petr", "Vtoroi", 39, "F"));
        students.add(new Student(6l, "Rayimbek", "Ernur", 85, "B"));

    }
    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student) {
        student.setId(id);
        students.add(student);
        id++;
    }
}
