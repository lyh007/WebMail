package com.live.webmail.dao.impl;

import com.live.webmail.base.BaseTestCase;
import com.live.webmail.base.Page;
import com.live.webmail.base.QueryParams;
import com.live.webmail.model.User;
import com.live.webmail.service.UserService;
import org.junit.Test;

import java.util.List;

/**
 * @author kevin
 * @version Revision: 1.00 Date: 10-12-2下午3:01
 * @Email liuyuhui007@gmail.com
 */
public class UserDaoTest extends BaseTestCase {
    private UserService userService = null;

    public UserDaoTest() {
        userService = (UserService) getApplicationContext().getBean("userService");
    }

    @Test
    public void testGetUserById() {
        User user = userService.getById(1);
        System.out.println(user.getName());
    }

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("坚持到底");
        userService.save(user);
    }

    @Test
    public void testUpdate() {
        User user = userService.getById(1);
        user.setName("modify userName");
        userService.update(user);
    }

    @Test
    public void testDelete() {
        userService.delete(4);
    }

    @Test
    public void testQQ() {
        QueryParams<User> queryParams = new QueryParams<User>();
        Page paging = new Page(1, 2);
        queryParams.setPaging(paging);
        List<User> userList = userService.queryByPage(queryParams);
        System.out.println("user size:" + userList.size());
    }
}
