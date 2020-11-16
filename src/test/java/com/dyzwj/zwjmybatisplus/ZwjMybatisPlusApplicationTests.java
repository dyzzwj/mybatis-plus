package com.dyzwj.zwjmybatisplus;

import com.dyzwj.zwjmybatisplus.domain.Person;
import com.dyzwj.zwjmybatisplus.domain.User;
import com.dyzwj.zwjmybatisplus.mapper.UserMapper;
import com.dyzwj.zwjmybatisplus.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class ZwjMybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> userList = userMapper.getUserList();
        userList.forEach(System.out::println);
    }

    @Test
    public void test1(){
        Map<String,Object> param = new HashMap<>();
        param.put("username","zwj");
        List<User> users = userMapper.selectByMap(param);
        users.forEach(System.out::println);
    }

    @Test
    public void test2(){
        User user = new User(2,"dyz",20);
        userMapper.insert(user);
    }
    @Test
    public void test3(){
        userMapper.deleteById(2);
    }

    @Autowired
    private PersonService personService;

    @Test
    public void test4(){
        personService.insert(new Person(5,"zwj",22));
    }

    @Test
    public void test5(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"zth",30));
        personList.add(new Person(2,"zzx",32));
        personList.add(new Person(3,"zth",26));
        personList.add(new Person(4,"ztq",24));
        personService.insertBatch(personList);
   }

    @Test
    public void test6(){
        personService.deleteBatchIds(Arrays.asList(1,2,3,4));
    }

    @Test
    public void test7(){
       personService.selectList(null).forEach(System.out::println);
    }



}
