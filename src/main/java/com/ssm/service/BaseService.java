package com.ssm.service;

public interface BaseService<T ,K>  {
    T get(K k);
}
