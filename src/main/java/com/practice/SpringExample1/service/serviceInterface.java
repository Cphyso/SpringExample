package com.practice.SpringExample1.service;

public interface serviceInterface {
    void addUser(String name, String surname, long id);
    void deleteUserId(long id);
    void getUserById(long id);
}
