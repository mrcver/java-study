package com.xhdoc.springboot.mapper;

import com.xhdoc.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author tim
 */
@Mapper
public interface UserMapper {

    /**
     * @return 用户列表
     */
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(name) VALUES(#{name})")
    void insert(UserEntity user);

    @Update("UPDATE users SET name=#{name} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
