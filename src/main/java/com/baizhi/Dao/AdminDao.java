package com.baizhi.Dao;

import com.baizhi.entity.Admin;

import java.util.List;
//对方的撒旦发射点看
public interface AdminDao {
    //插入用户
    public void insertAdmin(Admin admin);

    //通过用户名查询用户
    public Admin queryAdmin(String username);

    /**
     * 查询所有用户方法
     *
     * @return 查询的所有用户
     */
    public List<Admin> queryAllAdmin();

}
