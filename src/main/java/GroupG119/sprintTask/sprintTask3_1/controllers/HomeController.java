package GroupG119.sprintTask.sprintTask3_1.controllers;

import GroupG119.sprintTask.sprintTask3_1.db.DBManager;
import GroupG119.sprintTask.sprintTask3_1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model){
        model.addAttribute("students", DBManager.getStudents());
        return "index";
    }

    @GetMapping(value = "/add_student")
    public String addStudent(){
        return "addStudent";
    }

    @PostMapping(value = "/add_student")
    public String addStudent(@RequestParam(name="name") String name,
                             @RequestParam(name="surname") String surname,
                             @RequestParam(name="exam") int exam){
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);
        student.setMark(exam);
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
