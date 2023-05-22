package com.test.flyway.service.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    public String name;
    public int employees;
    public List<String> offices;
}
