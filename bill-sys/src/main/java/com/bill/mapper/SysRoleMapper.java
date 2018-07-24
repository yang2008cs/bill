package com.bill.mapper;

import com.bill.entity.SysRole;

import java.util.List;
import java.util.Map;

public interface SysRoleMapper {

    int insert(SysRole sysRole);

    int update(SysRole sysRole);

    int deleteById(String id);

    int deleteByIds(List ids);

    List<SysRole> selectAll(Map<String, Object> map);

    SysRole selectById(String id);
}
