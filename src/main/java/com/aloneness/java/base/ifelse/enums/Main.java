package com.aloneness.java.base.ifelse.enums;

/**
 * @author aloneness
 * @date 2020/6/18
 */
public class Main {

    /**
     * 使用枚举优化后，再进行判断就会变得比较方便简洁了
     *
     * @param roleName
     * @return
     */
    public String judge(String roleName) {
        return RoleEnum.valueOf(roleName).operate();
    }

    public static void main(String[] args) {
        System.out.println(new Main().judge("ROLE_HR"));
    }

}
