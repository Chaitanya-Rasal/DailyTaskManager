package com.TaskManager.util;

public class SessionManager {
    private static int userId;

    public static void setUser(int id) {
        userId = id;
    }

    public static int getUser() {
        return userId;
    }

    public static void logout() {
        userId = 0;
    }
}