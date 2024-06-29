package com.vti.ulti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/assignment_10";
        String user = "root";
        String password = "scoping01";
        return DriverManager.getConnection(url, user, password);
    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Kết nối thành công " + getConnection().getCatalog());
        } catch (SQLException exception) {
            System.err.println("Kết nối thất bại " + exception.getMessage());
        }
    }
}

