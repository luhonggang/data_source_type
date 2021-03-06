package com.shanlin.quant.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="user")
public class UserInfo {
    @Id
    @GeneratedValue
     Long userId;

     String username;

     String password;

    /* Date loginTime;

     Date createdAt;

     String createdBy;

     Date updatedAt;

     String updatedBy;

     Long expireTime;*/
}
