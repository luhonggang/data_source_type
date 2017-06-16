package com.shanlin.demo.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by hezuchao on 2017/6/8.
 */
@Data
@Entity
@Table(name="test_user")
public class JpaUser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;
}
