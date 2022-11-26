package com.studentmanagement.studentmanagementsystem.repository;

import com.studentmanagement.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
