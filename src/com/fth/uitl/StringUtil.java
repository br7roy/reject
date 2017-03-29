/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package com.kwxyzk.uitl 
 * FileName: StringUtil.java
 * Author:   Administrator
 * Date:     2017年2月9日 上午9:31:13
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   Administrator           2017年2月9日上午9:31:13                     1.0                  
 *===============================================================================================
 */
package com.kwxyzk.uitl;

import java.text.DateFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年2月9日 <br>
 * 作者：Administrator <br>
 * 说明：<br>
 */
public class StringUtil {
    
    public StringUtil() {
    }

    public static boolean isBlank(String str) {
        int var3;
        if(str != null && (var3 = str.length()) != 0) {
            for(int i = 0; i < var3; ++i) {
                if(!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static boolean isBlank(Object obj) {
        return obj == null || obj.equals("null") || obj.equals("");
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isNotBlank(Object str) {
        return !isBlank(str);
    }

    public static void isNull(Object object, String message) {
        if(object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void notNull(Object object, String message) {
        if(object != null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void notNull(Object object) {
        notNull(object, "[Assertion failed] - this argument is required; it must not be null");
    }

    public static boolean isEmpty(String value) {
        return value == null || value.trim().length() == 0 || "null".endsWith(value);
    }

    public static boolean isEmpty(Object value) {
        return value == null || value.equals("null") || value.equals("");
    }

    public static boolean isNotEmpty(Object value) {
        return value != null && !"".equals(value);
    }

    public static boolean isEmptyMap(Map<?, ?> value) {
        return value == null || value.size() <= 0;
    }

    public static boolean isNotEmptyMap(Map<?, ?> value) {
        return value != null && value.size() > 0;
    }

    public static void isEmptyMap(Map<?, ?> value, String message) {
        if(value == null || value.size() == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    public static boolean isEmptyList(List<?> value) {
        return value == null || value.size() <= 0;
    }

    public static boolean isNotEmptyList(List<?> value) {
        return value != null && value.size() > 0;
    }

    public static void isEmptyList(List<?> value, String message) {
        if(value == null || value.size() == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !"".equals(str.trim());
    }

    public static boolean isNull(Object object) {
        return object instanceof String?isEmpty(object.toString()):object == null;
    }

    public static boolean isNullLength(Object object) {
        return object instanceof String?isEmptyLength(object.toString()):object == null;
    }

    public static boolean validIntateType(String value) throws Exception {
        if(isBlank(value)) {
            return false;
        } else {
            int max = 2147483647;
            int min = -2147483648;
            value = value.trim();
            Locale locale = Locale.getDefault();
            DecimalFormatSymbols symbol = new DecimalFormatSymbols(locale);

            for(int formatName = 0; formatName < value.length(); ++formatName) {
                char e = value.charAt(formatName);
                if((48 > e || e > 57) && e != symbol.getGroupingSeparator() && (formatName != 0 || e != 45)) {
                    return false;
                }
            }

            NumberFormat var8 = NumberFormat.getNumberInstance(locale);

            try {
                Integer var9 = Integer.valueOf(var8.parse(value).toString());
                if(var9.intValue() <= max && var9.intValue() >= min) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception var7) {
                return false;
            }
        }
    }

    public static boolean valiDateTimedateType(String value) throws Exception {
        if(isBlank(value)) {
            return false;
        } else {
            try {
                DateFormat e = null;
                Locale locale = Locale.getDefault();
                e = DateFormat.getDateInstance(2, locale);
                e.setLenient(false);
                e.parse(value);
                return true;
            } catch (ParseException var3) {
                return false;
            }
        }
    }

    public static boolean isEmptyLength(String value) {
        return value == null || value.length() == 0 || "null".endsWith(value);
    }

    public static boolean equals(String str1, String str2) {
        return str1 == null?str2 == null:str1.equals(str2);
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return str1 == null?str2 == null:str1.equalsIgnoreCase(str2);
    }
}
