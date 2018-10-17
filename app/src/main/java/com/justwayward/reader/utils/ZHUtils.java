package com.justwayward.reader.utils;

import com.spreada.utils.chinese.ZHConverter;

/**
 * Created by zhq on 2018/10/18.
 */

public class ZHUtils {
    public static String getComplexZH(String simplifiedSrc) {
        String traditional = ZHConverter.convert(simplifiedSrc, ZHConverter.TRADITIONAL);
        return traditional;
    }
}
