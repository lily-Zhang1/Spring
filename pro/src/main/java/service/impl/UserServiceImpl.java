package service.impl;

import domain.User;
import service.IUserService;
import dao.IUserDao;

import java.util.List;

/**
 * 用户的业务层实现类
 *
 * @author lily
 * */

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public User findUserByName(String userName) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Integer useriD) {

    }
}
