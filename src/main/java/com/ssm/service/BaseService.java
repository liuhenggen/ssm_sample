package com.ssm.service;

public interface BaseService<T ,K>  {
    T get(K k);
    K save(T t);
    K update(T t);
    K delete(K k);
}
