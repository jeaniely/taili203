package com.neuedu.object.six;

public class Test {
    /**
     *  重写：
     *  1） 子类继承或者实现父类
     *  2） 方法名，参数，返回值保持一致
     *  3） 限定修饰符权限，子类要么于父类相同，要么大于父类
     *
     *   @Override 注解
     *   1）重写
     *   2）约束
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student=new Student();
        student.sleep();
        student.eat();
        student.cry();
        System.out.println("==========================");
        Teacher teacher=new Teacher();
        teacher.cry();
        teacher.eat();
        teacher.sleep();
    }
}
