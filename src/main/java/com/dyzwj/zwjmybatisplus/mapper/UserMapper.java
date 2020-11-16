package com.dyzwj.zwjmybatisplus.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dyzwj.zwjmybatisplus.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getUserList();

}
