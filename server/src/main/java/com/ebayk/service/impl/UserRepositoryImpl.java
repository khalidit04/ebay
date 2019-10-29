package com.ebayk.service.impl;

import com.ebayk.data.user.SampleData;
import com.ebayk.data.user.User;
import com.ebayk.service.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User getUser(int id) {
        return SampleData.USERS.get(id);
    }

    public Map<Integer, User> getUsers() {
        return SampleData.USERS;
    }

}
