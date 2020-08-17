package com.neuedu.api.object0805.file01;

import com.neuedu.api.object0805.file01.controller.StudentController;
import com.neuedu.api.object0805.file01.entry.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 1： 使用文件实现学生信息的存储，
     * 分析：
     * 1） 多个人信息
     *      首先将学生信息存在集合中，
     *      然后将这个集合存文件中。
     *      List
     * 2） 学生类： 姓名，性别，年龄
     *
     *3） 使用方法实现功能
     *    增加学生信息
     *    删除学生信息
     *    修改学生信息
     *    从文件中提取学生信息
     *    将学生信息放入文件中
     *
     */

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        /*StudentController.addStudent(students);
        try {
            StudentController.writeFileInformation("d:/demo/dir/student.txt",students);

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
          students=  StudentController.readerFileInformation("d:/demo/dir/student.txt");
            if(students!=null){
                System.out.println(students);
            }else{
                System.out.println("文件不存在");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
