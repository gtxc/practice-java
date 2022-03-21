package com.gtxc.practice.singleton;

public class Database {

    private String name;

    private static Database instance;

    public static synchronized Database getInstance(String name) {

        if (instance == null) {
            instance = new Database(name);
        }

        return instance;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
