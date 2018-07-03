package com.bill.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LiuYang
 * @version 1.0
 * @package: com.bill.entity
 * @description: 菜单
 * @date 2018-06-29 15:46
 */
@Getter
@Setter
@ToString
public class SysMenu implements Serializable{
    private static final long serialVersionUID = -8718022362212790698L;
    /** 主键 **/
    private String id;
    /** 菜单名称 **/
    @NotEmpty(message = "菜单名称不能为空")
    private String name;
    /** 父id **/
    private String pid;
    /** URL **/
    private String url;
    /** 序号 **/
    @Length(min = 1,max = 4, message = "序号长度不对")
    private Integer orderNum;
    /** 创建时间 **/
    private Date createDate;
    /** 更新时间 **/
    private Date updateDate;
    /** 权限 **/
    private String permission;
    /** 菜单类型 0按钮 1菜单**/
    private Byte menuType;
    /** 子菜单 **/
    private List<SysMenu> children=new ArrayList<SysMenu>();
    /** 添加子菜单 **/
    public void addChild(SysMenu sysMenu){
        children.add(sysMenu);
    }
}
