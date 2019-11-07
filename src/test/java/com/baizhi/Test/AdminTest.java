package com.baizhi.Test;

import com.baizhi.Dao.AdminDao;
import com.baizhi.Util.MybatisUtil;
import com.baizhi.entity.Admin;
import org.junit.Test;

public class AdminTest {
    @Test
    public void queryAdmin() {
        AdminDao ad = MybatisUtil.getSqlSession().getMapper(AdminDao.class);
        Admin name = ad.queryAdmin("邹定帆");
        System.out.println(name);

    }
}
