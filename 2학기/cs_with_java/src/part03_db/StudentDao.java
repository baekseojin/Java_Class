package part03_db;

import java.sql.*;

public class StudentDao {
    public void add(Student student) throws SQLException, ClassNotFoundException {
        // 1. db 접속
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:top://localhost/~/part03", "sa", "");
        PreparedStatement ps = conn.prepareStatement("insert into students values(?,?,?)");
        ps.setString(1, student.getId());
        ps.setString(2, student.getName());
        ps.setString(3, student.getDepartment());
        ps.executeUpdate();
        conn.commit();

        // 3. 종료
        ps.close();
    }

    public Student get(String number) throws ClassNotFoundException, SQLException {
        Student student = new Student("", "", "");
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:top://localhost/~/part03", "sa", "");
        PreparedStatement ps = conn.prepareStatement("select * from students where id = ?");
        ps.setString(1, number);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            student.setId(rs.getString("id"));
            student.setName(rs.getString("name"));
            student.setDepartment(rs.getString("department"));
        }
        conn.commit();

        return student;
    }
}
