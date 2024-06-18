package part03_db;

import java.sql.SQLException;

public class TransactionTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Student student = new Student("2200", "choi", "SW");

        // 생성된 객체를 db에 저장
        StudentDao dao = new StudentDao();
        dao.add(student);

        // 과제
        Student getStudent = dao.get("2200");
        System.out.println(getStudent.getName());

    }
}
