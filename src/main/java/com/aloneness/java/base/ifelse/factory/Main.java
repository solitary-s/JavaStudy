package com.aloneness.java.base.ifelse.factory;


/**
 * @author aloneness
 * @date 2020/6/19
 */
public class Main {

    /**
     * 使用工厂模式
     *
     * @param roleName
     * @return
     */
    public String judge(String roleName) {
        return RoleFactory.getRole(roleName).operate();
    }

    public static void main(String[] args) {
        System.out.println(new Main().judge("ROLE_HR"));
    }
}
