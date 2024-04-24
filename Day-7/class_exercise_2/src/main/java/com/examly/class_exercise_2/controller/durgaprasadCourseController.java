package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.durgaprasadCourse;
import com.examly.class_exercise_2.service.durgaprasadCourseService;

@RestController
public class durgaprasadCourseController {

     @Autowired
     public durgaprasadCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<durgaprasadCourse> postMethodName(@RequestBody durgaprasadCourse entity) {

          durgaprasadCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<durgaprasadCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<durgaprasadCourse>> getMethodName() {

          List<durgaprasadCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<durgaprasadCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<durgaprasadCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<durgaprasadCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}