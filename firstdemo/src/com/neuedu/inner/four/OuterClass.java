package com.neuedu.inner.four;

public class OuterClass {
    private void innerDisplay(boolean b){
        if(b){
            class InnerClass{
                private String str;
                public InnerClass(String str){
                    this.str=str;
                }

                public String getStr(){
                    return str;
                }
            }

            InnerClass innerClass=new InnerClass("neuedu");
            System.out.println(innerClass.getStr());

        }else{
            System.out.println("无效位置");
        }
    }

    public void  get(boolean b){
        innerDisplay(b);
    }


}
