package com.cbsd.spboot_es.controller;

import com.cbsd.spboot_es.entity.mysql.SysUser;
import com.cbsd.spboot_es.repository.SysUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private SysUserRepository sysUserRepository;

    @RequestMapping("/getUser")
    public String getUser(){
        SysUser sysUser = sysUserRepository.getOne("1");
        return sysUser.getUserName();
    }
}
