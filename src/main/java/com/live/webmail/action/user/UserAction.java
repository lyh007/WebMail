package com.live.webmail.action.user;

import com.live.webmail.base.Page;
import com.live.webmail.base.QueryParams;
import com.live.webmail.core.web.action.BaseAction;
import com.live.webmail.model.User;
import com.live.webmail.service.UserService;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kevin
 * @version Revision: 1.00 Date: 10-12-3上午9:38
 * @Email liuyuhui007@gmail.com
 * 用户管理
 */
@Controller
@Scope("prototype")
@ParentPackage(value = "struts-default")
@Results(
        @Result(name = "success", location = "/WEB-INF/jsp/user/list_user.jsp")
)
public class UserAction extends BaseAction {
    private List<User> userList = new ArrayList<User>();
    @Autowired
    private UserService userService;

    //用户列表
    public String list() {
//        userList = userService.queryAll();
        QueryParams<String> queryParams = new QueryParams<String>();
        if (records == 0) {
            records = userService.getTotalCount(null);
        }
        Page paging = new Page(currentPage, pageSize, records);
        queryParams.setPaging(paging);
        Map<String, String> entity = new HashMap<String, String>();
//		if(keyWords!=null && keyWords.length()>0){
//			entity.put("keyWords", keyWords);
//		}
//		if(startTime!=null && startTime.length()>0){
//			entity.put("startTime", startTime);
//		}
//		if(endTime!=null && endTime.length()>0){
//			entity.put("endTime", endTime);
//		}
//		queryParams.setEntity(entity);
        records = queryParams.getPaging().getRecords();
        userList = userService.queryByPage(queryParams);
        records = queryParams.getPaging().getRecords();
        return SUCCESS;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
