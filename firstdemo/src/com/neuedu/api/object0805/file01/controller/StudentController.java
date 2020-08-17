package com.neuedu.api.object0805.file01.controller;

import com.neuedu.api.object0805.file01.entry.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    static Scanner scanner=new Scanner(System.in);

    private StudentController(){}

    /**
     * 添加学生
     * @param studentList 保存学生信息
     */
    public static void addStudent(List<Student> studentList){
        System.out.println("添加学生信息");
        Student student=new Student();
        System.out.println("学生姓名：");
        student.setName(scanner.next());
        System.out.println("性别");
        student.setSex(scanner.next());
        System.out.println("年龄");
        student.setAge(scanner.nextInt());

        studentList.add(student);

    }

    /**
     *  查找
     * @param studentList
     * @param name
     * @return  -1 到 集合size长度
     */
    private static int findStudent(List<Student> studentList,String name){
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除学生信息
     * @param studentList
     * @param name
     * @return 如果删除成功，返回删除的数据，失败，返回null;
     */
    public static Student deleteStudent(List<Student> studentList,String name){
        int index=findStudent(studentList, name);
        if(index==-1){
           return null;
        }else{
            Student student=studentList.remove(index);
            return student;
        }
    }

    /**
     * 修改数据
     * @param studentList
     * @param name
     * @return  修改成功返回true，失败返回false
     */
    public static boolean updateStudent(List<Student> studentList,String name){
        int index=findStudent(studentList, name);
        if(index==-1){
           return false;
        }else{
            Student student=studentList.get(index);
            System.out.println("修改年龄：");
            student.setAge(scanner.nextInt());
            return true;
        }
    }

    /**
     *  将集合写入到文件中
     * @param pathname
     * @param studentList
     * @return
     * @throws IOException
     */
    public static boolean writeFileInformation(String pathname,List<Student> studentList) throws IOException {
        File file=new File(pathname);
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos=new FileOutputStream(file);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(studentList);
        oos.flush();
        oos.close();
        bos.close();
        fos.close();
        return true;

    }

    /**
     *   将数据从文件中提取
     * @param pathname
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<Student> readerFileInformation(String pathname) throws IOException, ClassNotFoundException {
        File file=new File(pathname);
        if(!file.exists()){
            return null;
        }

        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        List<Student> studentList=(List<Student>)ois.readObject();

        ois.close();
        bis.close();
        fis.close();
        return studentList;
    }




}
