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
    private UserDao userDao;

    /**
     * 保存用户信息
     *
     * @param entity 用户信息
     */
    public final void save(User entity) {
        userDao.save(entity);
    }

    /**
     * 更新用户信息
     *
     * @param entity 用户信息
     */
    public final void update(User entity) {
        userDao.update(entity);
    }

    /**
     * 删除用户
     *
     * @param id 用户标识
     */
    public final void delete(Integer id) {
        userDao.delete(id);
    }

    /**
     * 删除多个用户
     *
     * @param ids 用户标识字符串
     */
    public final void deleteByIds(String ids) {
        userDao.deleteByIds(ids);
    }

    /**
     * 获取用户信息
     *
     * @param id 用户标识
     * @return 用户信息
     */
    public final User getById(Integer id) {
        return userDao.getById(id);
    }

    /**
     * 分页查询用户列表
     *
     * @param queryParams 查询条件
     * @return 用户列表
     */
    public final List<User> queryByPage(QueryParams<?> queryParams) {
        return userDao.queryByPage(queryParams);
    }

    /**
     * 分页查询用户列表总数
     *
     * @param params 查询条件
     * @return 用户数
     */
    public final int getTotalCount(Object params) {
        return userDao.getTotalCount(params);
    }
}
