package week01.ch01;

import week01.ch01.Employee;

public class StaticExam {
    public static void main(String[] args) {
        Employee choi = new Employee();
        System.out.println(choi.getEmployeeId()); // 1001

        Employee kim = new Employee();
        System.out.println(kim.getEmployeeId()); // 1002

        System.out.println(Employee.getSerialNum());

    }
}
