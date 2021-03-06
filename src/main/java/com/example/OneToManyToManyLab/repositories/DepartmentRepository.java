package com.example.OneToManyToManyLab.repositories;


import com.example.OneToManyToManyLab.models.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
