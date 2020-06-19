package com.aloneness.java.base.ifelse.factory;

import com.aloneness.java.base.ifelse.enums.RoleOperation;

/**
 * hr 角色
 *
 * @author aloneness
 * @date 2020/6/19
 */
public class RoleHR implements RoleOperation {

    private String roleName;

    public RoleHR(){}

    public RoleHR(String roleName) {
        this.roleName = roleName;
    }

    public String operate() {
        return roleName + " has BBB permission";
    }
}
