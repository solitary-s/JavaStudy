package com.aloneness.java.base.ifelse.factory;

import com.aloneness.java.base.ifelse.enums.RoleOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * role 工厂
 *
 * @author liaoshitong
 * @date 2020/6/19
 */
public class RoleFactory {

    private static Map<String, RoleOperation> roleOperationMap = new HashMap<String, RoleOperation>(16);

    static {
        roleOperationMap.put("ROLE_ADMIN", new RoleAdmin("ROLE_ADMIN"));
        roleOperationMap.put("ROLE_HR", new RoleHR("ROLE_HR"));
        roleOperationMap.put("ROLE_NORMAL", new RoleNormal("ROLE_NORMAL"));
        roleOperationMap.put("ROLE_OTHER", new RoleOther("ROLE_OTHER"));
    }

    public static RoleOperation getRole(String roleName) {
        return roleOperationMap.get(roleName);
    }
}
