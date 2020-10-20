package com.joker.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    static void gen1(){
        String[] strs = {"a", "b", "c", "d"};
        Stream<String> stream = Stream.of(strs);
        stream.forEach(System.out::println);
    }

    //通过集合来生成
    static void gen2(){
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

    //generate
    static void gen3(){
        Stream<Integer> generate = Stream.generate(() -> 1).limit(10);
        generate.forEach(System.out::println);
    }

    //使用iterator
    static void gen4(){
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(10);
        iterate.forEach(System.out::println);
    }

    //其他方式
    static void gen5(){
        String str = "abcdefg";
        IntStream stream = str.chars();
        stream.forEach(System.out::println);
    }

    static void gen() {
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();
    }

    static void middle() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(x -> 1 == (x % 2)).forEach(System.out::println);

        //求出所有基数的和
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = list.stream().filter(x -> 1 == (x % 2)).mapToInt(x -> x).sum();
        System.out.println(sum);

        //求集合中的最大值
        Optional<Integer> max1 = list.stream().max(Comparator.comparingInt(a -> a));
        System.out.println(max1.get());

        Optional<Integer> first = list.stream().sorted((a, b) -> a - b).findFirst();
        System.out.println("max = " + first.get());

        //取出满足条件的任一元素
        Optional<Integer> any = list.stream().filter(x -> 1 == (x % 2)).findAny();
        System.out.println(any.get());

        //打印20-30的元素
        Stream.iterate(1 , x  -> x + 1).limit(50).skip(20).limit(10).forEach(System.out::println);
    }

    public static void main(String[] arags){
        // stream 生成操作
        gen();

        // 中间操作:如果调用的方法之后返回的是Stream对象，就意味着是一个中间操作
        middle();
    }
}
