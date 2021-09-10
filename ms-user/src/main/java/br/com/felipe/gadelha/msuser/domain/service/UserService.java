package br.com.felipe.gadelha.msuser.domain.service;

import br.com.felipe.gadelha.msuser.api.dto.ResponseTemplateDTO;
import br.com.felipe.gadelha.msuser.domain.entity.User;
import br.com.felipe.gadelha.msuser.domain.repository.UserRepository;
import br.com.felipe.gadelha.msuser.infra.client.DepartmentClient;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final DepartmentClient departmentClient;

    public UserService(UserRepository userRepository, DepartmentClient departmentClient) {
        this.userRepository = userRepository;
        this.departmentClient = departmentClient;
    }
    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public ResponseTemplateDTO getUserWithDepartment(Long id) {
        var user = userRepository.findById(id).get();
        var department = departmentClient.getDepartment(user.getDepartmentId());
        return new ResponseTemplateDTO(user, department);
    }
}
