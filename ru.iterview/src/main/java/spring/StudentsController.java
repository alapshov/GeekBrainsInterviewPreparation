package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class StudentsController {

    @Autowired
    StudentDataService studentDataService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentDataService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentByID(@PathVariable Long id) {
        return studentDataService.getStudentById(id);
    }

    @PostMapping
    public Student postSaveStudent(@RequestBody Student student) {
        return studentDataService.saveStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentDataService.deleteStudentById(id);
    }

}
