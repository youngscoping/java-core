package com.vti.frontend;

import com.vti.repository.DepartmentRepository;

import java.sql.SQLException;

public class DepartmentProgram {
    public static void main(String[] args) throws SQLException {
        DepartmentRepository repository = new DepartmentRepository();
        DepartmentFunction function = new DepartmentFunction(repository);
        function.showMenu();
    }
}
