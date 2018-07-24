package com.bill.service;

import com.bill.entity.SysRole;
import com.bill.util.Result;

import java.util.List;

public interface SysRoleService {
    Result insert(SysRole sysRole);

    Result update(SysRole sysRole);

    Result deleteById(String id);

    Result deleteByIds(List ids);

    Result selectAll(String roleName,Integer pageIndex, Integer pageSize);

    SysRole selectById(String id);
}
