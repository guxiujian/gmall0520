package com.atyzu.gmall.user.controller;

import com.atyzu.gmall.user.bean.UmsMember;
import com.atyzu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atyzu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){ 
        return "hello, gmall0520";
    }

    @RequestMapping("getAll")
    @ResponseBody
    public List<UmsMember> getAll(){
        List<UmsMember> list = userService.getAll();
        return list;
    }

    @RequestMapping("getAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> list = userService.getUmsMemberReceiveAddressByMemberId(memberId);
        return list;
    }
}
