package com.bridgelabz.emplyeeWages1;

public class EmployeeWages1 {
    public static void main(String[] args) {
        int IS_PRESENT = 1;
        int empCheck = (int) Math.floor(Math.random() * 10) %2;
        if( empCheck == IS_PRESENT ) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
