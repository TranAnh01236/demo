package com.iuh.demo_spring_data_jpa.repository;

import com.iuh.demo_spring_data_jpa.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
