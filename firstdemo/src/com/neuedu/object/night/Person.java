package com.neuedu.object.night;

/**
 *  抽象方法和抽象类， 关键词：abstract
 *
 *  抽象类不一定包含抽象方法，但抽象方法一定在抽象类中
 *  抽象类：抽象方法，成员变量，成员方法等
 *
 *  子类：如果是普通类，继承抽象类之后，需要重写抽象类中的抽象方法（必须）
 *        如果是抽象类，继承抽象类之后，可以或者不用重写抽象方法
 *
 *   抽象类不能直接使用抽象类实例化，使用非抽象类的子类实现
 *
 */
public abstract class Person {/*抽象类*/
    public abstract void eat();/*抽象方法*/
}
