package com.xhdoc.springboot.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    public UserEntity() {
        super();
    }

    public UserEntity(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
