package com.practice.SpringExample1.dao;

import com.practice.SpringExample1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDBImpl implements FakeDBInterface {

    List<User> DB = new ArrayList<>();

    @Override
    public void addUser(String name, String surname, long id) {
        User userToAdd = new User();
        userToAdd.setName(name);
        userToAdd.setSurname(surname);
        userToAdd.setId(id);
        DB.add(userToAdd);
    }

    @Override
    public void deleteUserId(long id) {
        for(int i = 0; i < DB.size(); i++){
            if(DB.get(i).getId() == id){
                DB.remove(id);
                return;
            }
        }
    }

    @Override
    public void getUserById(long id) {
        for(int k = 0; k < DB.size();k++){
            if(DB.contains(DB.get(k))){
                System.out.println();
            }
        }
    }
}
