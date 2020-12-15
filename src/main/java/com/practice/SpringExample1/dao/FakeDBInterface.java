package com.practice.SpringExample1.dao;

public interface FakeDBInterface {


    void addUser(String name, String surname, long id);

    void deleteUserId(long id);
    void getUserById(long id);
}
