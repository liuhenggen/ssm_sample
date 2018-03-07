package com.ssm.dao;

public interface BaseDao<T , K> {
    K save(T t);
    K update(T t);
    K delete(K k);
    T get(K k);

}
