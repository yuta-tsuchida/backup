package com.human;

public class HumanName {
public String sei;
private String mei;
  public HumanName(){
	sei="土田";
	mei="悠太";
  }
  public HumanName(String sei,String mei){
	  this.sei=sei;
	  this.mei=mei;
  }
  public String getName(){
	  return sei + mei ;
  }
  public String getMei(){
	  return mei;
  }
}
