package com.jsgrewal.springbackend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departments")
public class Department {
    @Id
    @Column(name = "DEPTNO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptid;
    private String name;
    public long getDeptid() {
        return deptid;
    }
    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    private String location;


}
