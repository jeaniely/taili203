package com.neuedu.obectexample02.three;

public class English extends  Student {
  private double speech;
  public English(String sid,String name,String sex,int age,double middleTerm,double finalTerm,double speech){
      super(sid,name,sex,age,middleTerm,finalTerm);
      this.speech=speech;
  }



    @Override
    public double getScore() {
        return speech*0.5+getFinalTerm()*0.25+getMiddleTerm()*0.25;
    }

    @Override
    public void showAll() {
        System.out.println(super.toString()+"综合成绩："+getScore());
    }
}
