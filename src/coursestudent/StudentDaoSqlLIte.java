package coursestudent;

import coursestudent.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDaoSqlLIte {
    public static Connection c;

    public static void insertToDB(Student s1) {

        String sql = "INSERT INTO student (first_name, last_name) VALUES(?, ?)";

        try (PreparedStatement s = c.prepareStatement(sql)) {
            s.setString(1, s1.getFirstName());
            s.setString(2, s1.getLastName());

            s.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void connectToDB(String fileName) {
        try {
            c = DriverManager.getConnection("jdbc:sqlite:" + fileName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
