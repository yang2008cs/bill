package com.bill.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = -1323363324945691136L;
    private String roleId;
    private String menuId;
}
