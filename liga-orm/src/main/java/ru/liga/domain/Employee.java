package ru.liga.domain;

public class Employee {
    private final String id;
    private final String fio;
    private final String gender;
    private final String faculty;
    private final String degree;
    private final String position;
    private final String birthday;

    public Employee(String id, String fio, String gender, String faculty, String degree, String position, String birthday) {
        this.id = id;
        this.fio = fio;
        this.gender = gender;
        this.faculty = faculty;
        this.degree = degree;
        this.position = position;
        this.birthday = birthday;
    }
}
