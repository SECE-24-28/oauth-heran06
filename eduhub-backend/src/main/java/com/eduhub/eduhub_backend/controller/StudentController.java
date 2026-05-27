//package com.eduhub.eduhub_backend.controller;
//
//import com.eduhub.eduhub_backend.component.Student;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class StudentController {
//
//    //http://localhost:8080/student
//    @GetMapping("student")
//    public ResponseEntity<Student> getStudent(){
//        Student student = new Student(1,"Heranyaa","T P");
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }
//
//    //http://localhost:8080/students
//    @GetMapping("students")
//    public ResponseEntity<List<Student>> getStudents(){
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(1,"Heranyaa","T P"));
//        studentList.add(new Student(2,"Harini","K"));
//        studentList.add(new Student(3,"Hasini","R"));
//        studentList.add(new Student(4,"Haritha","N"));
//
//        return new ResponseEntity<>(studentList,HttpStatus.OK);
//    }
//
//    //http://localhost:8080/id/first-name/last-name
//    @GetMapping("{id}/{first-name}/{last-name}")
//    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
//                                                       @PathVariable("first-name") String firstName,
//                                                       @PathVariable("last-name") String lastName)
//    {
//        Student student = new Student(studentId,firstName,lastName);
//        return new ResponseEntity<>(student,HttpStatus.OK);
////        return ResponseEntity.ok(student);
//    }
//
////    http://localhost:8080/query?studentId=1&firstName=Heranyaa&lastName=T P
//    @GetMapping("query")
//    public ResponseEntity<Student> studentRequestVariable(@RequestParam int studentId,
//                                                          @RequestParam String firstName,
//                                                          @RequestParam String lastName)
//    {
//        Student student = new Student(studentId,firstName,lastName);
////        return new ResponseEntity<>(student,HttpStatus.OK);
//        return ResponseEntity.ok(student);
//    }
//
//    @PostMapping ("create")
//    public ResponseEntity<Student> createStudent(@RequestBody Student student){
//        System.out.println(student.getId());
//        System.out.println(student.getFirstName());
//        System.out.println(student.getLastName());
//        return ResponseEntity.ok(student);
//    }
////  http://localhost:8080/id/update
//    @PutMapping("{id}/update")
//    public ResponseEntity updateStudent(@PathVariable("id") int studentId,
//                                        @RequestBody Student student){
//        return ResponseEntity.accepted().body(student);
//    }
//}
