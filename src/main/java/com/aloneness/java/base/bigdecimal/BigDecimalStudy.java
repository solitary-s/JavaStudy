package com.aloneness.java.base.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalStudy {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.23519");
        // 保留两位小数, 舍弃小数策略  四舍五入 5舍弃
        BigDecimal b = a.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(b); // 1.24
        // 往下取舍
        BigDecimal c = a.setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(c); // 1.23
        // 往上取舍
        BigDecimal d = a.setScale(2, BigDecimal.ROUND_UP);
        System.out.println(d); // 1.24

    }
}
