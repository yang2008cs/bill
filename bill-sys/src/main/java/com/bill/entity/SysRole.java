package com.bill.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.entity
 * @description: TODO
 * @date 2018-06-29 15:55
 */
@Getter
@Setter
@ToString
public class SysRole implements Serializable {
    private static final long serialVersionUID = -5085414443489357975L;
    /** 主键 **/
    private String id;
    /** 角色名 **/
    @NotEmpty(message = "角色名称不能为空")
    private String roleName;
    /** 备注 **/
    private String remark;
    /** 创建时间 **/
    private Date createDate;
    /** 更新时间 **/
    private Date updateDate;
}
