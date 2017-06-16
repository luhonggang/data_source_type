package com.shanlin.demo.mapper;


import com.shanlin.demo.model.MongodbUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by hezuchao on 2017/6/9.
 */
public interface MongodbUserRepository extends MongoRepository<MongodbUser, Long> {
    MongodbUser findByUsername(String username);
}
