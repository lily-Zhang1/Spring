package dao;

import domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 *
 * @author lily
 * */
public interface IUserDao {
    /**
     * 查询所有
     * @author lily
     * */
    List<User> findAllUser();

    /**
     * 根据用户名查询用户
     * @author lily
     * */
    User findUserByName(String userName);

    /**
     * 保存
     * @author lily
     * */
    void saveUser(User user);

    /**
     * 更新
     * @author lily
     * */
    void updateUser(User user);

    /**
     * 删除
     * @author lily
     * */
    void deleteUser(Integer useriD);
}
