package com.StudentRegistration.StudentRegistration.StudentEntity;

import org.springframework.data.repository.CrudRepository;
import com.StudentRegistration.StudentRegistration.StudentEntity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
