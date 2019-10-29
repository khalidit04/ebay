package com.ebayk.service;

import com.ebayk.data.user.User;

import java.util.Map;

public interface UserRepository {
    public User getUser(int id);

    public Map<Integer, User> getUsers();
}
