package br.com.felipe.gadelha.msuser.api.dto;

import br.com.felipe.gadelha.msuser.domain.entity.User;

public class ResponseTemplateDTO {

    private User user;
    private Department department;

    @Deprecated
    public ResponseTemplateDTO() { }

    public ResponseTemplateDTO(User user, Department department) {
        this.user = user;
        this.department = department;
    }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}
