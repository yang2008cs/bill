package com.bill.service.impl;

import com.bill.entity.SysLog;
import com.bill.enums.HttpStatusEnums;
import com.bill.mapper.SysLogMapper;
import com.bill.service.SysLogService;
import com.bill.util.Result;
import com.bill.util.ResultUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.service.impl
 * @description: 业务层实现
 * @date 2018-06-29 14:48
 */
@Service
public class SysLogServiceImpl implements SysLogService{

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public Result insert(SysLog sysLog) {
        try {
            sysLogMapper.insert(sysLog);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.error(HttpStatusEnums.TEMP_ERROR,e.getMessage());
        }
        return ResultUtils.success();
    }

    @Override
    public Result selectAll(SysLog sysLog,Integer pageIndex,Integer pageSize) {
        List<SysLog> sysLogList = null;
        try {
            Page<SysLog> page = PageHelper.startPage(pageIndex, pageSize);
            sysLogList = sysLogMapper.selectAll(sysLog);
        } catch (Exception e) {
            return ResultUtils.error(HttpStatusEnums.TEMP_ERROR,e.getMessage());
        }
        return ResultUtils.success(sysLogList);
    }
}
