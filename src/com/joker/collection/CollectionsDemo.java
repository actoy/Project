package com.joker.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 工具类
 */
public class CollectionsDemo {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bbbb");
        list.add("casadfadf");
        list.add("dasdfasdf3");
        Collections.addAll(list, "easdf", "fwqr", "qwrqwer");
        System.out.println(list);

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                } else if (o1.length() < o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                } else if (o1.length() < o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        System.out.println(list);
        //二分查找前需要先排序，否则将返回负值
        System.out.println(Collections.binarySearch(list, "dasdfasdf3"));

        Collections.fill(list, "Joker");
        System.out.println(list);
    }
}
