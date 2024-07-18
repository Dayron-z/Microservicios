package com.microservice.student.microservice_student.persistence;

import com.microservice.student.microservice_student.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Long, Student> {
    List<Student> findAllByCourseId(Long id);
}
