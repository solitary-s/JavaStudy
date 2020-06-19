package com.aloneness.java.base.ifelse.enums;

/**
 * 角色枚举
 *
 * @author liaoshitong
 * @date 2020/6/18
 */
public enum RoleEnum implements RoleOperation{
    // role admin
    ROLE_ADMIN {
        public String operate() {
            return "ROLE_ADMIN has AAA permission";
        }
    },
    ROLE_HR {
        public String operate() {
            return "ROLE_HR has BBB permission";
        }
    },
    ROLE_NORMAL {
        public String operate() {
            return "ROLE_NORMAL has CCC permission";
        }
    },
    ROLE_OTHER {
        public String operate() {
            return "ROLE_OTHER has DDD permission";
        }
    };
}
