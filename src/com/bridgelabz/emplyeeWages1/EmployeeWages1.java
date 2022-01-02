package com.bridgelabz.emplyeeWages1;

public class EmployeeWages1 {
    //Constants are called inside the class only
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        //Initiating Variables
        int empWages = 0;
        int empHours = 0;
        //Employee Presentee calculation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee has worked as Full Time");
                empHours = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee has worked as Part Time");
                empHours = 4;
                break;
            default :
                System.out.println("Employee has not Worked");
                empHours = 0;
        }
               int empWage = empHours * WAGE_PER_HOUR;
            System.out.println("Employee Daily Wage:" +empWage);
    }
}
