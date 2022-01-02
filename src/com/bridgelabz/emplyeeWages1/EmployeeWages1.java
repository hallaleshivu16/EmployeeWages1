package com.bridgelabz.emplyeeWages1;

public class EmployeeWages1 {
    //Constants are called inside the class only
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static final int WORKING_DAY_PER_MONTH = 20;
    private static final int WOKING_HOURS = 100;

    public static void main(String[] args) {
        //Initiating Variables
        int empWages = 0;
        int empHours = 0;
        int totalWages = 0;
        int totalHours = 0;
        int i = 1;

        //Running while Loop to Reach Working Day or Maximum Working Hour
        while ( i <= WORKING_DAY_PER_MONTH && totalHours < WOKING_HOURS) {
            System.out.println("total Hours:" +totalHours);
            System.out.println("Woking Days:" +i);
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
            i++;
            totalHours = totalHours + empHours;
        }
        totalWages = totalHours * WAGE_PER_HOUR;
        System.out.println("Employee Monthly Wages:" +totalWages);
    }
}
