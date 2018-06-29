package com.bill.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.entity
 * @description: 日志
 * @date 2018-06-29 14:04
 */
@Getter
@Setter
@ToString
public class SysLog implements Serializable{
    private static final long serialVersionUID = -8364291282325578747L;
    /** 主键 **/
    private String id;
    /** 用户名 **/
    private String userName;
    /** ip **/
    private String ip;
    /** 动作 **/
    private String type;
    /** 描述 **/
    private String text;
    /** 参数 **/
    private String param;
    /** 创建时间 **/
    private Date createTime;
}
