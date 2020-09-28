package my.collection;

import java.util.ArrayList;

/**
 *  * 实例ArrayListDemo
 *  *
 *  * @version 1.0
 *  
 */
public class ArrayListDemo {

    public static class Person implements Cloneable {
        private String name;

        public Person(String name) {
            this.set(name);
        }

        public String get() {
            return this.name;
        }

        public void set(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println(this.name);
        }

        @Override
        public String toString() {
            return this.name.toString();
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("isEmpty true = " + list.isEmpty());
        list.add(1);
        list.add(3);
        System.out.println("isEmpty false = " + list.isEmpty());
        System.out.println("size = " + list.size());
        System.out.println("contains = " + list.contains(1));
        System.out.println("toArray = " + list.toArray());


        ArrayList<Person> person1 = new ArrayList <>();
        person1.add(new Person("lisi"));
        person1.add(new Person("zhangsan"));
        System.out.println("person1 = " + person1);

        //ArrayList clone 是浅拷贝
        ArrayList<Person> person2 = (ArrayList<Person>) person1.clone();
        Person p = person1.get(0);
        p.set("qianqian");
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
    }
}
