package com.atyzu.gmall.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.atyzu.gmall.bean.UmsMember;
import com.atyzu.gmall.bean.UmsMemberReceiveAddress;
import com.atyzu.gmall.service.UserService;
import com.atyzu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atyzu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAll() {
        List<UmsMember> list = userMapper.getAll();
        return list;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId) {
        // Example example = new Example(UmsMemberReceiveAddress.class);
        // example.createCriteria().andEqualTo("memberId","memberId");
        // List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.selectByExample(example);

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return list;
    }
}
