package com.rwh.springhelloworld.courses;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseService {
    private final List<Course> courseList;


    public CourseService() {
        this.courseList = Arrays.asList(
                new Course(1, "learn micro Service", "Ryan H"),
                new Course(2, "a man and a goat", "banana man")
        );
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public Course getCourseById(int id) {
        return courseList.stream().filter(course -> course.getId() == id).findFirst().orElse(null);
    }
}
