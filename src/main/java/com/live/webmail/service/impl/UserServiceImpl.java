package com.live.webmail.service.impl;

import com.live.webmail.base.QueryParams;
import com.live.webmail.dao.UserDao;
import com.live.webmail.model.User;
import com.live.webmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kevin
 * @version Revision: 1.00 Date: 10-12-3上午10:06
 * @Email liuyuhui007@gmail.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    public User getById(int id) {
        return userDao.getById(id);
    }

    public void save(User entity) {
        userDao.save(entity);
    }

    public void update(User entity) {
        userDao.update(entity);
    }

    public void delete(Integer id) {
        userDao.delete(id);
    }

    public void deleteByIds(String ids) {
        userDao.deleteByIds(ids);
    }

    public User getById(Integer id) {
        return userDao.getById(id);
    }

    public List<User> queryByPage(QueryParams<?> queryParams) {
        return userDao.queryByPage(queryParams);
    }

    public int getTotalCount(Object params) {
        return userDao.getTotalCount(params);
    }
}
