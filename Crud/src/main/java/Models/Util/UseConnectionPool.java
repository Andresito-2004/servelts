package Models.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseConnectionPool {
    private static Connection getConnection()
            throws SQLException {
        return ConnectionPool.getConnection();
    }
    public static void main(String[] args)
            throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM programa")) {
            while (rs.next()) {

                System.out.println(rs.getInt("ide_Pro"));
                System.out.print(" | ");
                System.out.println(rs.getString("nom_Pro"));
                System.out.print(" | ");
                System.out.println(rs.getString("est_Pro"));

            }
        }
    }
}
