package com.udea.clase19.repository;
import com.udea.clase19.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer> {
}
