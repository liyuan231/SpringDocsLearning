package com.liyuan.dao;

import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from wxuser")
    public Object[] getUsers();
}
