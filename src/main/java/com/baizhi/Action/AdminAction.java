package com.baizhi.Action;
//远程仓库的修改
//本地仓库的修改
//阿斯蒂芬
import com.baizhi.Service.AdminService;
import com.baizhi.Service.AdminServiceImpl;
import com.baizhi.entity.Admin;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminAction extends ActionSupport {
    //接受数据
    private String username;
    //注册
    private Admin admin;

    public String queryAdmin() {
        //调用业务
        AdminService as = new AdminServiceImpl();
        Admin admin = as.queryAdmin(username);

        //获取Response作用域
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTf-8");
        try {
            PrintWriter out = response.getWriter();
            //如果没有这个用户名
            if (admin != null) {
                out.print("你的用户已经被注册");
            } else {
                out.print("你的用户没有被注册");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public String insert() {
        AdminService as = new AdminServiceImpl();
        as.insetAdmin(admin);
        return "insertOk";
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
