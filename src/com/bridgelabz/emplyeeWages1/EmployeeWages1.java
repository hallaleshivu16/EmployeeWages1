package com.bridgelabz.emplyeeWages1;

public class EmployeeWages1 {
    //Constants are called inside the class only
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static final int WORKING_DAY_PER_MONTH = 20;

    public static void main(String[] args) {
        //Initiating Variables
        int empWages = 0;
        int empHours = 0;
        int totalWages = 0;

        //Running for Loop to Compute Monthly Salary
        for (int i = 1; i <= WORKING_DAY_PER_MONTH; i ++) {

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
                default:
                    System.out.println("Employee has not Worked");
                    empHours = 0;
            }
            empWages = empHours * WAGE_PER_HOUR;
            totalWages = empWages + totalWages;
        }
            System.out.println("Employee Monthly Wages:" +totalWages);
    }
}
