package com.TaskManager.service;

import java.util.Scanner;
import com.TaskManager.dao.*;
import com.TaskManager.model.User;
import com.TaskManager.util.SessionManager;

public class UserServiceImpl implements UserService {

    Scanner sc = new Scanner(System.in);
    UserDAO dao = new UserDAOImpl();

    public void register() {
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        if(dao.register(new User(u,p)))
            System.out.println("Registered!");
    }

    public boolean login() {
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        int id = dao.login(u,p);

        if(id > 0) {
            SessionManager.setUser(id);
            System.out.println("Login Successful!");
            return true;
        }
        System.out.println("Invalid Credentials!");
        return false;
    }
}