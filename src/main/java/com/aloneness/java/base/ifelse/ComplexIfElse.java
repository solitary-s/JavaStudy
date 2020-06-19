package com.aloneness.java.base.ifelse;

/**
 * @author aloneness
 * @date 2020/6/18
 */
public class ComplexIfElse {

    /**
     * 根据角色判断有什么权限
     * if else 逻辑简单，但如果角色有十几个时，判断就会变得很繁琐，我们可以使用一些特殊的处理方法使ifelse变得简洁
     *
     * @param roleName
     * @return
     */
    public String judge(String roleName) {
        String result = "";
        if ("ROLE_ADMIN".equals(roleName)) {
            result = "ROLE_ADMIN has AAA permission";
        } else if ("ROLE_HR".equals(roleName)) {
            result = "ROLE_HR has BBB permission";
        } else if ("ROLE_NORMAL".equals(roleName)) {
            result = "ROLE_NORMAL has CCC permission";
        } else {
            result = "other";
        }
        return result;
    }

    public static void main(String[] args) {
        String hrPermission = new ComplexIfElse().judge("ROLE_HR");
        System.out.println(hrPermission);
    }

}
