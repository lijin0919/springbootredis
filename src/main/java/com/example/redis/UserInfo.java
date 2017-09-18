package com.example.redis;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserInfo{

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
}
