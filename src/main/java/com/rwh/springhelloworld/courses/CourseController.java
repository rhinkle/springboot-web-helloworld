package com.rwh.springhelloworld.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;


    //courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getCourseList();
    }

    //courses/1
    @GetMapping("/courses/id")
    public ResponseEntity<String> getCourseById(@RequestParam String reqId) {
        if(true) {
            return ResponseEntity.status(HttpStatus.OK).body("hello");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
