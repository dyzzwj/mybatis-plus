package com.dyzwj.zwjmybatisplus.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dyzwj.zwjmybatisplus.domain.Person;
import com.dyzwj.zwjmybatisplus.mapper.PersonMapper;
import com.dyzwj.zwjmybatisplus.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {


}
