package br.com.felipe.gadelha.msdepartment.domain.repository;

import br.com.felipe.gadelha.msdepartment.domain.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
