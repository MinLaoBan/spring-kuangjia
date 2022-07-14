package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ... ");
    }



    public void init() {
        System.out.println("init ... ");
    }


    public void destroy() {
        System.out.println("destroy ... ");
    }
}
