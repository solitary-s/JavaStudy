package com.aloneness.java.base.ifelse.factory;

import com.aloneness.java.base.ifelse.enums.RoleOperation;

/**
 * normal 角色
 *
 * @author aloneness
 * @date 2020/6/19
 */
public class RoleNormal implements RoleOperation {

    private String roleName;

    public RoleNormal(){}

    public RoleNormal(String roleName) {
        this.roleName = roleName;
    }

    public String operate() {
        return roleName + " has CCC permission";
    }
}
