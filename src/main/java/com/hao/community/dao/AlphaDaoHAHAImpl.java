package com.hao.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoHAHAImpl implements AlphaDao{
    @Override
    public String select() {
        return "AlphaDaoHAHAImpl";
    }
}
