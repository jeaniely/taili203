package com.neuedu.api.object0729.two;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {/*按照年龄进行排序*/
        return o2.getAge().compareTo(o1.getAge());
    }
}
