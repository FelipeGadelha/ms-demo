package br.com.felipe.gadelha.msdepartment.api.v1.controller;

import br.com.felipe.gadelha.msdepartment.domain.entity.Department;
import br.com.felipe.gadelha.msdepartment.domain.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentService.findById(id);
    }
}
