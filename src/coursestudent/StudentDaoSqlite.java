package coursestudent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoSqlite {
    private Connection conn;

    StudentDaoSqlite(String fileName) {
        connectToDB(fileName);
    }

    public void insertToDB(Student s1) {

        String sql = "INSERT INTO student (first_name, last_name) VALUES(?, ?)";

        try (PreparedStatement s = conn.prepareStatement(sql)) {
            s.setString(1, s1.getFirstName());
            s.setString(2, s1.getLastName());

            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void connectToDB(String fileName) {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try (Statement statement = conn.createStatement()) {


            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Student s = new Student();
                s.setFirstName(result.getString("first_name"));
                s.setLastName(result.getString("last_name"));
                students.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return students;
    }


    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
