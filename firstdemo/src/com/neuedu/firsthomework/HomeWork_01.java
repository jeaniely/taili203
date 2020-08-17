package com.neuedu.firsthomework;

public class HomeWork_01 {
    /**
     * 1:数组初始化
     * 2：for
     * 3：for 双重循环
     * 4：if判断
     * 5：foreach
     * 6：数据类型
     * 等
     * @param args
     */
    public static void main(String[] args) {

        int a[] ={12,56,8,7,66,23};
        /*1)外循环 ，趟数*/
        for(int i=0;i<a.length-1;i++){
            /*2）内循环实现最大值，*/
            for(int j=0;j<a.length-i-1;j++) {
                if (a[j] > a[j + 1]) {
                    /*a:第三个参数*/
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    /*b:
                       a=3,b=4
                               a  b
                    *  a=a+b;  7  4
                    *  b=a-b;  7  3
                    *  a=a-b;  4  3
                    *
                    * */
                }
            }

        }


        for(int k:a){
            System.out.print(k+"\t");
        }
    }
    /*
    *  1:冒泡排序 从小到大的顺序
    * 12 56 8 7 66 5   六个数据，需要5趟比较完成
    * 第一趟：12 8 7 56 5 66
    *
    *         12 56 8 7 66 5
    *         12 8  56  7 66 5
    *         12  8  7 56 66 5
    *          12  8  7 56 66 5
    *          12  8  7 56 5  66
    * 第二趟：8 7 12 5  56 66
    * 第三趟：7  8  5  12  56 66
    * 第四趟： 7  5 8  12 56  66
    * 第五趟   5 7 8 12 56 66
    * */
}
