package com.baizhi.Service;

import com.baizhi.entity.Admin;

public interface AdminService {
    //通过姓名查询用户
    public Admin queryAdmin(String username);

    //注册
    public void insetAdmin(Admin admin);
}
