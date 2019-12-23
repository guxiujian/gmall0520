package com.atyzu.gmall.user.service;

import com.atyzu.gmall.user.bean.UmsMember;
import com.atyzu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    List<UmsMember> getAll();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);
}
