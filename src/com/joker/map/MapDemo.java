package com.joker.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  * 实例MapDemo
 *  *
 *  * @version 1.0
 *  HashMap 和 HashTable的区别
 *      1.HashMap线程不安全，效率高。HashTable线程安全，效率低
 *      2.HashMap中key和value都允许为null，HashTable中key和value都不允许为空
 */
public class MapDemo {

    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(1));
        System.out.println(map.remove("a"));
        System.out.println(map.replace("b", 5));

        //遍历操作
        Set <String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        //只能获取对应的value，不能根据value获取key
        Collection <Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        //迭代器方式
        Set <String> keys2 = map.keySet();
        Iterator<String> iterator = keys2.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " = " + map.get(key));
        }

        //map.entry
        Set <Map.Entry <String, Integer>> entries = map.entrySet();
        Iterator <Map.Entry <String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry <String, Integer> next = iterator1.next();
            System.out.println(next.getKey() + " = " + next.getValue());
        }
    }
}
