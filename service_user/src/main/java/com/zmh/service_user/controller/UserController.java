package com.zmh.service_user.controller;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zmh.service_user.entry.User;
import com.zmh.service_user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/insert")
    @Transactional
    public String insertUser(@RequestBody String name){
        try{
            User user=new User();
            user.setUsername(name).setCreateTime(DateUtil.today());
            userMapper.insert(user);
            return "success";
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    @GetMapping("/select")
    public List<User> tolist(){
        QueryWrapper wrapper=new QueryWrapper();
        return userMapper.selectList(wrapper);
    }
    
    
    @GetMapping("/{user}")
    public Integer panduanUser(@PathVariable String user){
        return userMapper.panduan(user);
    }


}
