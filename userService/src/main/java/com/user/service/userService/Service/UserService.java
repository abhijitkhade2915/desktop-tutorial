package com.user.service.userService.Service;

import com.user.service.userService.entity.User;

import java.util.List;


public interface UserService {

    public User saveUser(User user);

    public List<User> getAllUser();

    public User getUser (int userId);
}
