package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchIn(double time){
        startTime = time;

    }

    public void punchOut(double time){

        double duration = time - startTime;
        hoursWorked += duration;
        startTime = 0;

    }

    //punchtimeCard to handle punching in and out in only 1 method
    public void punchTimeCard(Double time){
        if (startTime == 0){
            startTime = time;
        }else{
            double duration = time - startTime;
            hoursWorked += duration;
            startTime = 0;
        }
    }


}