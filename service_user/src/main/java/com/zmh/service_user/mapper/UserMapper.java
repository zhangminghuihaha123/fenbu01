package com.zmh.service_user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zmh.service_user.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
