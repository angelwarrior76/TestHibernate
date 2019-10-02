package com.homework.hibernate.test.main;

import com.homework.hibernate.test.model.Auto;
import com.homework.hibernate.test.model.User;

import com.homework.hibernate.test.services.UserService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User("Masha", 26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }

}
