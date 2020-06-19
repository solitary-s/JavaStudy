package com.aloneness.java.base.ifelse.factory;

import com.aloneness.java.base.ifelse.enums.RoleOperation;

/**
 * other 角色
 *
 * @author aloneness
 * @date 2020/6/19
 */
public class RoleOther implements RoleOperation {

    private String roleName;

    public RoleOther(){}

    public RoleOther(String roleName) {
        this.roleName = roleName;
    }

    public String operate() {
        return roleName + " has DDD permission";
    }
}
