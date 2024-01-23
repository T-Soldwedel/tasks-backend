package com.organise.DailyTasks.Service;

import com.organise.DailyTasks.Models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(String userId);

    User createUser(User user);

    User updateUser(String userId, User user);

    void deleteUser(String userId);
}