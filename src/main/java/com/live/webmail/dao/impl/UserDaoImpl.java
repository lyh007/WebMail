package com.live.webmail.dao.impl;

import com.live.webmail.dao.UserDao;
import com.live.webmail.model.User;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 10-11-29
 * Time: 下午1:35
 * Email:liuyuhui007@gmail.com
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public List<User> queryAll() {
        List<User> users = (List<User>) sqlSessionFactory.openSession().selectList("com.live.webmail.model.User");
        return users;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
