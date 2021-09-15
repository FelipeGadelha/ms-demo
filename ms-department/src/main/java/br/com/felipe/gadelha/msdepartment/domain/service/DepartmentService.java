package br.com.felipe.gadelha.msdepartment.domain.service;

import br.com.felipe.gadelha.msdepartment.domain.entity.Department;
import br.com.felipe.gadelha.msdepartment.domain.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public Department findById(Long id) {
        return departmentRepository.findById(id).get();
    }
}
