package com.dagger2.example;

/**
 * Component created on 11/12/2015.
 *
 * @author dmartin
 */
public class EmployeeBean {

    private String name;

    public EmployeeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
