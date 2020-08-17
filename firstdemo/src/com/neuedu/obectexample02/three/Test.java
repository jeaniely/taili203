package com.neuedu.obectexample02.three;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[5];
     /*   students[0]=new English("e001","lilli","m",22,88,89,70);

        students[1]=new Computer("c001","max","w",22,85,89,80,85);
        students[2]=new English("e002","lilli","m",22,88,89,70);
        students[3]=new Computer("c002","lilli","m",22,88,89,70,68);
        students[4]=new English("e003","lilli","m",22,88,89,70);
        */

     Scanner scanner=new Scanner(System.in);
     for(int i=0;i<students.length;i++){
         System.out.println("第"+(i+1)+"位同学的信息输入");
            Computer computer=new Computer();
             System.out.println("学号");
            computer.setSid(scanner.next());
             System.out.println("姓名");
             computer.setName(scanner.next());
             System.out.println("性别");
             computer.setSex(scanner.next());
             System.out.println("年龄");
             computer.setAge(scanner.nextInt());
             System.out.println("期中成绩");
             computer.setMiddleTerm(scanner.nextDouble());
             System.out.println("期末成绩");
             computer.setFinalTerm(scanner.nextDouble());
             System.out.println("操作成绩");
             computer.setOperation(scanner.nextDouble());
             System.out.println("写作成绩");
             computer.setEnglishWrite(scanner.nextDouble());

            students[i]=computer;

     }


        for(Student s:students){
            s.showAll();
        }



    }
}
