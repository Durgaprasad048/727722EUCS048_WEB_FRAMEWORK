package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.durgaprasadStudent;
import java.util.List;

@Repository
public interface durgaprasadStudentRepo extends JpaRepository<durgaprasadStudent, Long> {

    List<durgaprasadStudent> findByMarksGreaterThan(int mark);

    List<durgaprasadStudent> findByMarksLessThan(int mark);

}
