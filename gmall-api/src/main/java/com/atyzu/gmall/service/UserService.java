package com.atyzu.gmall.service;

import com.atyzu.gmall.bean.UmsMember;
import com.atyzu.gmall.bean.UmsMemberReceiveAddress;


import java.util.List;


public interface UserService {
    List<UmsMember> getAll();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);
}
