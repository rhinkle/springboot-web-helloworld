package com.rwh.springhelloworld.courses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
public class CourseServiceTest {
    CourseService courseService;

    @BeforeEach
    void setUp() {
        courseService = new CourseService();
    }

    @Test
    @DisplayName("Get All Courses")
    void getAllCourseList() {
        List<Course> courseList = courseService.getCourseList();
        Assertions.assertEquals(courseList.size(), 2);
    }

    @Test
    @DisplayName("Get Course by id")
    void getCourseByIdTest() {
        Course course = courseService.getCourseById(2);
        Assertions.assertEquals(course.getId(), 2);
    }

    @Test
    @DisplayName("Get Course by id invalid id.")
    void getCourseByIdInvalidIdTest() {
        Course course = courseService.getCourseById(3);
        Assertions.assertNull(course);
    }
}
