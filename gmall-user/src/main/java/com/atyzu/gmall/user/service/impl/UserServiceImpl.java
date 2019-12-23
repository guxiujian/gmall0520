package com.atyzu.gmall.user.service.impl;
import com.atyzu.gmall.user.bean.UmsMember;
import com.atyzu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atyzu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atyzu.gmall.user.mapper.UserMapper;
import com.atyzu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
