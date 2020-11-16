package com.dyzwj.zwjmybatisplus.controller;

import com.dyzwj.zwjmybatisplus.domain.Person;
import com.dyzwj.zwjmybatisplus.service.PersonService;
import com.dyzwj.zwjmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.PersistenceDelegate;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PersonService personService;

    @GetMapping("/person/list")
    public List<Person> getPersonList(){
        return personService.selectList(null);
    }

}
