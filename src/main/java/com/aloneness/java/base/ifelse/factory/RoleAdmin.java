package com.aloneness.java.base.ifelse.factory;

import com.aloneness.java.base.ifelse.enums.RoleOperation;

/**
 * admin 角色
 *
 * @author aloneness
 * @date 2020/6/19
 */
public class RoleAdmin implements RoleOperation {

    private String roleName;

    public RoleAdmin(){}

    public RoleAdmin(String roleName) {
        this.roleName = roleName;
    }

    public String operate() {
        return roleName + " has AAA permission";
    }
}
