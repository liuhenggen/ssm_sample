package com.ssm.dao;

public interface BaseDao<T , K> {

    T get(K k);

}
