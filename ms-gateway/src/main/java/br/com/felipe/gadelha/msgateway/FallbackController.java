package br.com.felipe.gadelha.msgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("ms-user-fallback")
    public String userFallback() {
        return "User service is taking longer than expected. Please try again later";
    }
    @GetMapping("ms-department-fallback")
    public String departmentFallback() {
        return "Department service is taking longer than expected. Please try again later";
    }
}
