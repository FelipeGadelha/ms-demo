package br.com.felipe.gadelha.msuser.infra.client;

import br.com.felipe.gadelha.msuser.api.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MS-DEPARTMENT")
public interface DepartmentClient {

    @GetMapping("/departments/{id}")
    Department getDepartment(@PathVariable Long id);

}
