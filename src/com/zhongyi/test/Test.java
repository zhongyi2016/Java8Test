package com.zhongyi.test;

import com.zhongyi.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description: 测试类
 * @author: zhongyi.li
 * @date: 2018-07-17 10:52:27
 */
public class Test {

    public static void main(String[] args){
        List<Person> personList = createPersonList();

        Stream<Person> stream = personList.stream();
        stream.forEach(p -> System.out.println(p.toString()));
    }

    static List<Person> createPersonList(){
        List<Person> personList = new ArrayList<>();
        Person p = new Person("刘备",30);
        personList.add(p);
        p = new Person("关羽",29);
        personList.add(p);
        p = new Person("张飞",28);
        personList.add(p);
        p = new Person("大乔",18);
        personList.add(p);
        return personList;
    }



}