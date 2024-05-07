package com.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/7 20:43
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
             Properties作为Map集合的操作
         */

        //1.创建集合对象
        Properties pro = new Properties();
        //2.添加数据
        //细节：虽然我们可以往Properties当中添加任意的数据类型，但是一般只会往里面添加字符串类型的数据
        pro.put("aaa","bbb");
        pro.put("ccc","bbb");
        pro.put("ddd","bbb");
        //3.打印集合
        Set<Map.Entry<Object, Object>> entries = pro.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
