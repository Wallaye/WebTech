package com.example.builder.impl;

import com.example.builder.Builder;
import com.example.entity.Role;
import com.example.entity.impl.UserEntity;
import com.example.exceptions.RepositoryException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBuilder implements Builder<UserEntity> {

    private static final String ID = "id";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String ROLE = "role";

    @Override
    public UserEntity build(ResultSet resultSet) throws RepositoryException {
        try {
            Integer id = resultSet.getInt(ID);
            String login = resultSet.getString(USERNAME);
            String password = resultSet.getString(PASSWORD);
            Role role = Role.valueOf(resultSet.getString(ROLE).toUpperCase());

            return new UserEntity(id, login, password, role);
        } catch (SQLException e) {
            throw new RepositoryException(e.getMessage());
        }
    }
}
