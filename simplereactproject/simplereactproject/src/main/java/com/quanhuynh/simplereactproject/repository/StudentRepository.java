package com.quanhuynh.simplereactproject.repository;

import com.quanhuynh.simplereactproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {



}
