package com.atyzu.gmall.user.mapper;

import com.atyzu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> getAll();
}
