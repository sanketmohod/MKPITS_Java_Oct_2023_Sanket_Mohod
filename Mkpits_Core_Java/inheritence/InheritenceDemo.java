package com.mkpits.inheritence;

 class ParentsClass {
    int num1,num2;
    public void getData(int num1,int num2) {
 	   this.num1 = num1;
 	   this.num2 = num2;
    }
    public void getSum() {
 	   int sum = num1 + num2;
 	   System.out.println("Addition is : "+sum);
    }
 }
class ChildClass extends ParentsClass{
	  public void getSub() {
		  int sub = num1 - num2;
		  System.out.println("Sub is : "+sub);
	  }
}

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cl = new ChildClass();
		cl.getData(25, 12);
		cl.getSum();
		cl.getSub();
	}

}
