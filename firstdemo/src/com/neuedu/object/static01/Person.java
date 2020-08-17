package com.neuedu.object.static01;

public class Person {
    private String name;
    private static int num;/*静态变量*/
    public Person(){
        num++;
        System.out.println("用户有"+num);
    }
/*静态代码块*/
    static { /*一般应用：jdbc导入的驱动，文件的导入，参数导入等等*/
        System.out.println("hello");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        eat();
        this.name = name;
    }

    public  static void eat(){/*静态方法中只能是静态的方法和变量*/

        System.out.println("吃香蕉"+" "+num);
    }


}
