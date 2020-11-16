package com.dyzwj.zwjmybatisplus.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dyzwj.zwjmybatisplus.domain.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Admin
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
