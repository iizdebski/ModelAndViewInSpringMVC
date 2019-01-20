package com.izdebski.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.izdebski.model.User;

@Repository
public class UserDAO {
    private static List<User> list = null;
    static{
        list = new ArrayList<User>();
        list.add(new User("Ronald", 30, "ronald.rn@gmail.com", "Ukraine"));
        list.add(new User("Martin", 40, "martin.mt@gmail.com", "US"));
        list.add(new User("Sean", 18, "sean.sn@gmail.com", "Canada"));
    }
    public List<User> getUserList() {
        return list;
    }
}