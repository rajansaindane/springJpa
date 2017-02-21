package com.example.rajan.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rajan on 13/2/17.
 */
@Entity
public class Employee {

    @Id
    private Integer id;
    private String name;
    private String city;
    private Integer deptid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private Integer salary;
}
