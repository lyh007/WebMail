package com.live.webmail.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = "success", location = "/WEB-INF/jsp/main.jsp", params = {})
})
public class IndexAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}