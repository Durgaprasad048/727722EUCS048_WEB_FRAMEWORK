package com.example.class_exercise_4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.class_exercise_4.model.durgaprasadAddress;

@RestController
public class durgaprasadAddressController {
          
     String name ="Nikkil";
    int doorno = 1;
     String streetname = "Kamarajar street";
     String area = "Kamarajar nagar";
     String district = "Chennai";
     String state = "Tamilnadu";
     String country = "India";
     int pincode = 600001;

     @GetMapping("/path")
     public durgaprasadAddress getMethodName() {
         durgaprasadAddress a= new durgaprasadAddress(name, streetname, area, district, state, country, doorno, pincode);
         return a;
     }
}
