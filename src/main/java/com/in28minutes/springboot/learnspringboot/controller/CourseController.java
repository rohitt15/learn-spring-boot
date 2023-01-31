package com.in28minutes.springboot.learnspringboot.controller;
import com.in28minutes.springboot.learnspringboot.entity.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "28minutes"),
                new Course(2, "Learn Devops" , "28minutes")
        );
    }
}
