package com.example.class_exercise_5.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import com.example.class_exercise_5.model.durgaprasadStudent;


@RestController
public class durgaprasadStudentController {
     

     @RequestMapping("/student")
     public List<durgaprasadStudent> requestMethodName() {
          List<durgaprasadStudent> students = new ArrayList<durgaprasadStudent>();
          
          students.add(new durgaprasadStudent("John","Welcome John!"));
         students.add(new durgaprasadStudent("Jane","Welcome Jane!"));

         return students;
     }
     
}
