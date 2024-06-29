package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    /**
     * @return tra ve tat user trong database
     * @throws SQLException neu xay ra loi ve SQL
     * @throws IOException neu xay ra loi cau hinh
     * */


    List<User> findAll() throws SQLException, IOException;


    /**
     * @param id khoa chinh cua user
     * @return
     * @throws SQLException
     * @throws IOException
     */
    User findById(int id) throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;
}
