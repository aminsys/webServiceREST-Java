package com.example.servicerest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students/liststudents")
    @ResponseBody
    public List<Students> getStudents(){
        return StudentRegistration.getInstance().getAllStudents();
    }

    @PostMapping("/add/student")
    @ResponseBody
    public RegistrationReply addStudent(@RequestBody Students student){
        RegistrationReply stdReg = new RegistrationReply();
        StudentRegistration.getInstance().add(student);

        stdReg.setStudentName(student.getName());
        stdReg.setStudentScore(student.getScore());
        stdReg.setStudentId(student.getId());
        stdReg.setRegistered("Yes");
        return stdReg;
    }

    @PutMapping("/update/student/{studentId}")
    @ResponseBody
    public String updateStudentRecord(@RequestBody Students student, @PathVariable("studentId") int id) {
        return StudentRegistration.getInstance().updateStudent(student, id);
    }

    @DeleteMapping("/delete/student/{studentId}")
    @ResponseBody
    public String deleteStudentRecord(@PathVariable("studentId") int id){
        return StudentRegistration.getInstance().RemoveStudent(id);
    }
}
