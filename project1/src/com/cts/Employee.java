package com.cts;

public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private float employeeSalary;
    public Employee(int employeeId,String employeeName,float employeeSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public class Manager extends Employee{
        public Manager(int employeeId,String employeeName)
    }
}
