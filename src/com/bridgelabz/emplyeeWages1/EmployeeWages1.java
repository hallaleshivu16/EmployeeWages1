package com.bridgelabz.emplyeeWages1;

public class EmployeeWages1 {
    private static int IS_FULL_TIME = 1;
    //private static int IS_PART_TIME = 2;
    //private static int FULL_DAY_HOURS = 8;
    private static int WAGE_PER_HOURS = 20;
    //private static int PART_DAY_HOURS = 4;
    private static int workingHours = 0;
    //private static int employeeDailyWages = 0;

    public static void main(String[] args) {
        int empCheck = (int) Math.floor(Math.random() * 10) %3;
        if( empCheck == IS_FULL_TIME ) {
            workingHours = 8;
            System.out.println("Employee is worked as Full Time");
        } else {
            workingHours = 4;
            System.out.println("Employee is worked as Part Time");
        }
            int employeeDailyWages = (int) Math.floor(workingHours * WAGE_PER_HOURS);
            System.out.println("Employee Daily Wages:" +employeeDailyWages);
    }
}
