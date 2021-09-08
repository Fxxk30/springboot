package com.huang.sbp03.mapper;

import com.huang.sbp03.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//这个注解表示这是一个mybatis的mapper类
@Repository
public interface UserMapper {//这是一个接口
    List<User> selectUser();
    User selectUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    String userLogin(User user);//传入多个参数时
    User aboutMe(Integer id);

}
