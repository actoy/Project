package com.joker.javase.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  * 实例MetaAnnotation
 *  * 元注解
 *  * @version 1.0
 *  注解原理：反射
 */
public class MetaAnnotation {

    @MyAnnotation(name="lisi", age = 13, id = 2, likes = {"1", "3"})
    public void test() {

    }
}

/**
 * @author lideyu
 */ //target 用来声明当前自定义的注解适合适用于什么地方，类、方法、变量、包等
@Target(ElementType.METHOD)
//retention 用来表示当前注解适用于什么环境，是源码级别（SOURCE）还是类级别（CLASS）还是运行时环境（RUNTIME)，一般都是运行时环境
@Retention(RetentionPolicy.RUNTIME)
//documented 表示该注解是否显示在javadoc中
@Documented
//inherited 表示当前注解是否能够被继承
@Inherited
@interface MyAnnotation {

    //定义的方式看起来像是方法，但是实际上使用在使用注解的时候填写的参数名称，默认的名称是value
    //自定义注解中填写的方法都需要在使用注解的时候，添加值，很麻烦，可以包含默认值
    String name() default "zhangsan";
    int age() default 12;
    int id() default 1;
    String[] likes() default {"1", "2"};
}
