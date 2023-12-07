package GroupG119.sprintTask.sprintTask3_1.db;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private  String mark;

    public Student(Long id, String name, String surname, int exam, String mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = mark;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public String getMark() {
        return mark;
    }



    public void setMark(int exam){

        if(exam >= 90){
            this.mark = "A";
        }
        else if(exam >= 75 && exam <= 89){
            this.mark = "B";
        }
        else if(exam >= 60 && exam <= 74){
            this.mark = "C";
        }
        else if(exam >= 50 && exam <=59){
            this.mark = "D";
        }
        else if(exam >= 0 && exam <= 49) {
            this.mark = "F";
        }
        else {
            this.mark="Invalid Data";
        }

    }
}
