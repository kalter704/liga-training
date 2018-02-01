package ru.liga.entity;

public class StudentEntity {
    private Long id;
    private String fio;
    private String gender;
    private String department;
    private String studentGroupId;
    private String birthday;

    public StudentEntity() {
    }

    public StudentEntity(Long id, String fio, String gender, String faculty, String studentGroupId, String birthday) {
        this.id = id;
        this.fio = fio;
        this.gender = gender;
        this.department = faculty;
        this.studentGroupId = studentGroupId;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentGroupId() {
        return studentGroupId;
    }

    public void setStudentGroupId(String studentGroupId) {
        this.studentGroupId = studentGroupId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
