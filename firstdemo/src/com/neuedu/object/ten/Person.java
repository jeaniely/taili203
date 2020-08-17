package com.neuedu.object.ten;

/**
 * 接口：
 *    关键词：interface
 *  包含元素：
 *      1：抽象方法
 *           public abstract 可省略
 *      2：常量
 *      public static final 可省略
 *      3：static|default方法
 *      static void jump(){
 *
 *    }
 *     default void driver(){
 *
 *     }
 *
 *  子类： 如果是普通类，实现（implements）之后，需要重写抽象方法
 *         如果是抽象类，实现（implements）之后，可以重写，也可以不重写
 *         如果是接口，实现（implements）之后，不重写
 *
 *   接口不能直接实例化，通过普通子类来实现
 *
 *   多实现，单继承
 *
 *
 *   作业：抽象类和接口的应用场景
 *
 */
public interface Person {/*接口*/
   void eat();
   void sleep();
   void cry();

}
