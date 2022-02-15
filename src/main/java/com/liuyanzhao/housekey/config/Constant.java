package com.liuyanzhao.housekey.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 言曌
 * @date 2022/1/4 2:45 下午
 */

public class Constant {

    public static Map<Integer, String> CATEGORY_MAP = new HashMap<>();

    static {
        CATEGORY_MAP.put(1, "一房一卫");
        CATEGORY_MAP.put(2, "两房两卫");
        CATEGORY_MAP.put(0, "两房一卫");
        CATEGORY_MAP.put(3, "三房两卫");
        CATEGORY_MAP.put(4, "四房两卫");
        CATEGORY_MAP.put(5, "主卧");
        CATEGORY_MAP.put(6, "单间");
    }

    public static Map<Integer, String> NEW_CATEGORY_MAP = new HashMap<>();
    static {
       NEW_CATEGORY_MAP.put(1, "整租/一房一卫");
       NEW_CATEGORY_MAP.put(2, "整租/两房两卫");
       NEW_CATEGORY_MAP.put(0, "整租/两房一卫");
       NEW_CATEGORY_MAP.put(3, "整租/三房两卫");
       NEW_CATEGORY_MAP.put(4, "整租/四房两卫");
       NEW_CATEGORY_MAP.put(5, "分租/主卧");
       NEW_CATEGORY_MAP.put(6, "分租/单间");
    }

    public static Map<Integer, String> STATE_CATEGORY_MAP = new HashMap<>();
    static {
        STATE_CATEGORY_MAP.put(0, "待出租");
        STATE_CATEGORY_MAP.put(1, "已租出");
    }
}
