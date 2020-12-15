package com.practice.SpringExample1.service;

import com.practice.SpringExample1.dao.FakeDBImpl;
import com.practice.SpringExample1.dao.FakeDBInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements serviceInterface {


    FakeDBInterface fakeDB;

    @Autowired
    public serviceImpl(FakeDBInterface fakeRepo){
        this.fakeDB = fakeRepo;
    }

    public void addUser(String name, String surname,long id) {

        fakeDB.addUser(name,surname,id);
        System.out.println("user successfully added");
    }

    public void deleteUserId(long id) {
        this.fakeDB.deleteUserId(id);
    }

    public void getUserById(long id) {
        this.fakeDB.getUserById(id);
    }
}
