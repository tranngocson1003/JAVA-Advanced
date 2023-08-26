package com.vti.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;

@Getter
@Setter
@ToString
public class DepartmentDto {
    private String name;

    public DepartmentDto(String name) {
        this.name = name;
    }
}
