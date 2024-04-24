package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.durgaprasadChildren;
import com.example.class_exercise_1.repository.durgaprasadChildrenRepo;

@Service
public class durgaprasadChildrenService {

     @Autowired
     public durgaprasadChildrenRepo childrenRepo;

     public List<durgaprasadChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public durgaprasadChildren save(durgaprasadChildren children) {
          return childrenRepo.save(children);

     }

     public List<durgaprasadChildren> sortedPage(int offset, int pagesize, String field) {
          Page<durgaprasadChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<durgaprasadChildren> pagination(int offset, int pagesize) {
          Page<durgaprasadChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
