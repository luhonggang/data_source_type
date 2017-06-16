package com.shanlin.demo.service;


import com.shanlin.demo.model.JpaUser;

/**
 * Created by hezuchao on 2017/6/8.
 */
public interface JpaUserService {
    JpaUser findById(Long id);
}
