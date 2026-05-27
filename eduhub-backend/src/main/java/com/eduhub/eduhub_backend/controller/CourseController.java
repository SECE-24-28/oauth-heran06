//package com.eduhub.eduhub_backend.controller;
//
//import com.eduhub.eduhub_backend.component.CourseService;
//import com.eduhub.eduhub_backend.component.InfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CourseController {
//    @Autowired
//    CourseService courseService;
//    @GetMapping("get-course")
//    public String getCourse(){
//        return courseService.getCourse();
//    }
//
//    @Autowired
//    InfoService infoService;
//    @GetMapping("get-info")
//    public String getInfo(){
//        return infoService.getInfo();
//    }
//}
package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.component.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("courses")
    public ResponseEntity<List<CourseService>> getcourses() {
        List<CourseService> courseList = new ArrayList<>();
        courseList.add(new CourseService("CS101", "Java Programming", 4));
        courseList.add(new CourseService("CS102", "Python Programming", 3));
        courseList.add(new CourseService("CS103", "Database Management", 4));
        courseList.add(new CourseService("CS104", "Operating Systems", 4));

        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }

    @GetMapping("{courseCode}")
    public ResponseEntity<CourseService> coursePathVariable(@PathVariable("courseCode") String courseCode) {

        CourseService courseService = new CourseService();
        return new ResponseEntity<>(courseService, HttpStatus.OK);

    }

    @GetMapping("query")
    public ResponseEntity<CourseService> courseRequestParam(
            @RequestParam String courseCode,
            @RequestParam String subjectName,
            @RequestParam int credits) {

        CourseService course = new CourseService(courseCode, subjectName, credits);

        return ResponseEntity.ok(course);
    }

    @PostMapping("create")
    public ResponseEntity<CourseService> createCourse(@RequestBody CourseService courseService) {
        System.out.println(courseService.getCourseCode());
        System.out.println(courseService.getSubjectName());
        System.out.println(courseService.getCredits());
        return ResponseEntity.ok(courseService);
    }

    @PutMapping("{courseCode}/update")
    public ResponseEntity updateCourse(@PathVariable("courseCode") String courseCode) {
        return ResponseEntity.accepted().body(courseCode);
    }

    @DeleteMapping("{coursecode}/delete")
    public ResponseEntity deleteCourse(@PathVariable("coursecode") String coursecode){
        return ResponseEntity.ok(coursecode);
    }
}
