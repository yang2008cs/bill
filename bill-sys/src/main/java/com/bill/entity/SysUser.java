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
 * @description:  用户
 * @date 2018-06-27 15:54
 */
@Setter
@Getter
@ToString
public class SysUser implements Serializable{

    private static final long serialVersionUID = 8774430734170459423L;

    private String id;
    /** 账号 使用电话号码 **/
    private String username;
    /** 密码 **/
    private String password;
    /** 年龄 **/
    private Integer age;
    /** 性别 1男 2女 **/
    private Integer sex;
    /** 电子邮箱 **/
    private String email;
    /** 照片 **/
    private String photo;
    /** 真是姓名 **/
    private String realName;
    /** 创建时间 **/
    private Date createDate;
    /** 更新时间 **/
    private Date updateDate;
    /** 1封禁 0可用 **/
    private Byte delFlag;

}
