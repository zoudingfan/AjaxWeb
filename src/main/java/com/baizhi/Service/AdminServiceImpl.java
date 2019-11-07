package com.baizhi.Service;

import com.baizhi.Dao.AdminDao;
import com.baizhi.Util.MybatisUtil;
import com.baizhi.entity.Admin;

import java.util.UUID;

public class AdminServiceImpl implements AdminService {
    @Override
    public Admin queryAdmin(String username) {
        AdminDao ad = MybatisUtil.getSqlSession().getMapper(AdminDao.class);
        Admin admin = ad.queryAdmin(username);
        MybatisUtil.close();
        return admin;
    }

    @Override
    public void insetAdmin(Admin admin) {
        try {
            AdminDao ad = MybatisUtil.getSqlSession().getMapper(AdminDao.class);
            admin.setId(UUID.randomUUID().toString());
            ad.insertAdmin(admin);
            MybatisUtil.commit();
        } catch (Exception e) {
            MybatisUtil.rollback();
        }
    }
}
