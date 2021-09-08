package com.huang.sbp03.controller;

import com.huang.sbp03.mapper.MessageMapper;
import com.huang.sbp03.mapper.UserMapper;
import com.huang.sbp03.pojo.Message;
import com.huang.sbp03.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MessageMapper messageMapper;

    @GetMapping("/selectUser")
    public List<User> selectUser(){
        List<User> userList = userMapper.selectUser();
        return userList;
    }
    @GetMapping("/selectUserById")
    public User selectUserById(int id){
        User user = userMapper.selectUserById(id);
        return user;
    }
    @RequestMapping("/addUser")
    public int addUser(User user){
        int add = userMapper.addUser(user);
        return add;
    }
    @RequestMapping("/updateUser")
    public int updateUser(User user){
        int update = userMapper.updateUser(user);
        return update;
    }
    @RequestMapping("/deleteUser")
    public int deleteUSer(int id){
        int delete = userMapper.deleteUser(id);
        return delete;
    }
    @RequestMapping("/userLogin")
    public int userLogin(User user){
        String userPwd = userMapper.userLogin(user);
        /*System.out.println(userPwd);
        System.out.println(user.getPwd());*/
        if (user.getPwd().equals(userPwd)){
            return 1;
        }else {
            return 0;
        }
    }
    @RequestMapping("/aboutMe")
    public User aboutMe(int id){
        User user = userMapper.aboutMe(id);
        return user;
    }
    @RequestMapping("/allMessage")
    public List<Message> allMessage(){
        List<Message> messages = messageMapper.selectMessage();
        return messages;

    }
    @RequestMapping("/addMessage")
    public int addMessage(Message message){
        int add = messageMapper.addMessage(message);
        return add;

    }
}
