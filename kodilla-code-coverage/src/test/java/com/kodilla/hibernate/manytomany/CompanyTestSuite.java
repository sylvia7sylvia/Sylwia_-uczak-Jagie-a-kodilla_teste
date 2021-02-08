package com.kodilla.hibernate.manytomany;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTestSuite {

    Company company = new Company("XYZ");

    @Test
    void setAndGetId() {
        //given
        company.setId(1);
        //when
        int result = company.getId();
        //then
        assertEquals(1, result);
    }

    @Test
    void setAndGetName() {
        //given
        company.setName("XYZ");
        //when
        String result = company.getName();
        //then
        assertEquals("XYZ", result);
    }

    @Test
    void setAndGetEmployees() {
        //given
        company.setEmployees(new ArrayList<>());
        //when
        List<Employee> result = company.getEmployees();
        //then
        assertEquals(0, result.size());
    }
}