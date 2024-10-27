package com.example.timesheet.model;

// 3.1 Создать класс Project с полями id, name

import lombok.Data;

@Data
public class Project {

    private Long id;
    private String projectName;
}
