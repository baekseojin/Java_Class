package week01.ch01;
public class Employee {
    private static int serialNum = 1000; // employee라는 클래스 이름으로 접근할 수 있는 static 변수
    private int employeeId;
    private String name;
    private String department;

    // alt + insert -> constructor : 생성자 생성
    public Employee() {
        serialNum++;
        this.employeeId = serialNum; // 객체를 생성할 때 마다 사원 번호 + 1로 생성한다
    }


    public static int getSerialNum() {
        return serialNum;
    }

    /*
    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }
    */

    public int getEmployeeId() {
        return employeeId;
    }

    // public void setEmployeeId(int employeeId) {
    //     this.employeeId = employeeId;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
