package com.vti.repository;



import com.vti.entity.Department;
import com.vti.ulti.JdbcUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DepartmentRepository  {


    public List<Department> findAll() throws SQLException {

        String sql = "SELECT * FROM department";
        try (Connection connection = JdbcUtil.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
                List<Department> departments = new LinkedList<>();
                while (rs.next()) {
                    Department department = new Department();
                    department.setId(rs.getInt("id"));
                    department.setName(rs.getString("name"));
                    departments.add(department);
                }
                return  departments;
        }
    }

    public int create(String name) throws SQLException {
        String sql = "INSERT INTO department(`name`) VALUES (?) ";
        try (Connection connection = JdbcUtil.getConnection();
             PreparedStatement pStmt = connection.prepareStatement(sql)) {
            pStmt.setString(1, name);
            return pStmt.executeUpdate();
        }
    }

    public Department findById(int id) throws SQLException {
        String sql = "SELECT * FROM department WHERE id = (?)";
        try (Connection connection = JdbcUtil.getConnection();
             PreparedStatement pStmt = connection.prepareStatement(sql)) {
            pStmt.setInt(1, id);
            try (ResultSet rs = pStmt.executeQuery()) {
                return rs.next() ? getDepartment(rs) : null;
            }
        }
    }

    private Department getDepartment(ResultSet rs) throws SQLException {
        Department department = new Department();
        department.setId(rs.getInt("id"));
        department.setName(rs.getString("name"));
        return department;
    }

}
