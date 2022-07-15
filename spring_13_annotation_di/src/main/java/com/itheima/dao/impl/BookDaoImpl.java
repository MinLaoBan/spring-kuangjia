package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;
    @Override
    public void save() {
        System.out.println("Book dao save ..." + name);
    }
}
