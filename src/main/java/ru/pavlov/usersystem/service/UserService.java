package ru.pavlov.usersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlov.usersystem.dao.UserDao;
import ru.pavlov.usersystem.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUserDao() {
        //предполагается что здесь логика проверок и тд
        return userDao.getUsers();
    }
}
