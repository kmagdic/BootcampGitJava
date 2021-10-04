package bicyclerent;

import java.sql.*;

public class BicycleDaoSqlite {
    Connection connection;

    public void makeDBConnection(String fileName) {


        String sql = "CREATE TABLE IF NOT EXISTS bicycle (\n"
                + "	id integer PRIMARY KEY AUTOINCREMENT,\n"
                + "	brand text,\n"
                + "	max_gear integer\n"
                + ");";


        try{
            connection = DriverManager.getConnection("jdbc:sqlite:" + fileName);
            Statement stmt = connection.createStatement();
            // create a new table if it doesn't exist
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void saveBicycle(Bicycle b) {
        String sql = "INSERT INTO bicycle(brand, max_gear) VALUES(?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, b.getBrand());
            pstmt.setInt(2, b.getMaxGear());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Bicycle loadBicycleById(int id) {
        String sql = "SELECT * FROM bicycle where id=" + id;

        try (Statement stmt  = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            // loop through the result set
            if (rs.next()) {
                Bicycle b = new Bicycle();
                b.setBrand(rs.getString("brand"));
                b.setMaxGear(rs.getInt("max_gear"));
                return b;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }


}
