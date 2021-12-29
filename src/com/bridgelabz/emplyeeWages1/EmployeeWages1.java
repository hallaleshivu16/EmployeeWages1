package com.bridgelabz.emplyeeWages1;

public class EmployeeWages1 {
    //Constants are called inside the class only
    private static int IS_PRESENT = 1;
    private static int WAGE_PER_HOUR = 20;
    private static int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        int empCheck = (int) Math.floor(Math.random() * 10) %2;
        if( empCheck == IS_PRESENT ) {
            System.out.println("Employee is Present");
            int empWage = (int) Math.floor(WAGE_PER_HOUR * FULL_DAY_HOUR);
            System.out.println("Employee Daily Wage:" +empWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee DAily Wage:" +0 );
        }
    }
}
