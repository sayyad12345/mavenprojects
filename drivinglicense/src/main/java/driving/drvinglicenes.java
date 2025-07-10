package driving;
import driving.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class drvinglicenes {

    public static void createTable(String tbl, String sql)  {
        try (Connection con = dbconnect.getConnection();
             Statement stmt = con.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table created (if not exists).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String tableName, String name, int age, String address, String vehical, String date) {
        String query = "INSERT INTO " + tableName + " (name, age, address, vehical, date) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = dbconnect.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.setString(4, vehical);
            ps.setString(5, date);
            ps.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateData(String tableName, String name, int age, String address, String vehical, String date) {
        String query = "UPDATE " + tableName + " SET name=?, age=?, address=?, vehical=?, date=? WHERE name=?";
        try (Connection con = dbconnect.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.setString(4, vehical);
            ps.setString(5, date);
            ps.setString(6, name); // For WHERE clause
            int rowAffected = ps.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Data updated successfully.");
            } else {
                System.out.println("No matching record found to update.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showTable(String tableName) {
        String sql = "SELECT * FROM " + tableName;
        try (Connection con = dbconnect.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nData from " + tableName + ":");
            System.out.println("Name | Age | Address | Vehicle | Date");
            while (rs.next()) {
                System.out.println(
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("address") + " | " +
                    rs.getString("vehical") + " | " +
                    rs.getString("date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


