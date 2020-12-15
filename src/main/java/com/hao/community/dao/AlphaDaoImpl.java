package com.hao.community.dao;

import org.springframework.stereotype.Repository;

@Repository("haoge")

public class AlphaDaoImpl implements AlphaDao{
    @Override
    public String select() {
        return "AlphaDaoImpl";
    }
}
