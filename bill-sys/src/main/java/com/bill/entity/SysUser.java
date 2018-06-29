package com.bill.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "账号不能为空")
    @Length(min = 5,max = 20, message = "账号长度不对")
    private String username;
    /** 密码 **/
    @NotEmpty(message = "密码不能为空")
    @Length(min = 8,max = 20, message = "密码长度不对")
    private String password;
    /** 年龄 **/
    private Integer age;
    /** 性别 1男 2女 **/
    private Integer sex;
    /** 生日 **/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
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
