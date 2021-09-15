package br.com.felipe.gadelha.msuser.api.dto;

public class Department {

    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    @Deprecated
    public Department() { }

    public Department(Long id, String departmentName, String departmentAddress, String departmentCode) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentAddress() { return departmentAddress; }
    public void setDepartmentAddress(String departmentAddress) { this.departmentAddress = departmentAddress; }
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }
}
