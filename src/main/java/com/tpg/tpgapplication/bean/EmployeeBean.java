package com.tpg.tpgapplication.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeBean {
    private Long id;
    private String name;
    private Integer age;
    private String designation;
}
