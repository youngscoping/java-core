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


    List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException;


    /**
     * @param id khoa chinh cua user
     * @return
     * @throws SQLException
     * @throws IOException
     */

    List<User> findAllManager() throws SQLException, IOException;

    User findManagerByEmailAndPassword(String email, String password) throws SQLException, IOException;


}
