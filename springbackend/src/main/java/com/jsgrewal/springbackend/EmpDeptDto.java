package com.jsgrewal.springbackend;

public class EmpDeptDto {
    private long empno;
    private String name;
    private String job;
    private String dept;
    public EmpDeptDto(long empno, String name, String job, String dept) {
        this.empno = empno;
        this.name = name;
        this.job = job;
        this.dept = dept;
    }
    public long getEmpno() {
        return empno;
    }
    public void setEmpno(long empno) {
        this.empno = empno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
}
