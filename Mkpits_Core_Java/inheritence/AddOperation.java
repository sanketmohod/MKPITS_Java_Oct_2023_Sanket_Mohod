package com.mkpits.inheritence;
// Super/Grand Father class
public class AddOperation {
         int numb1,numb2;
         public void getData(int numb1,int numb2) {
        	 this.numb1 = numb1;
        	 this.numb2 = numb2;
         }
         public void getAdd() {
        	 int add = numb1 + numb2;
        	 System.out.println("Addition of "+numb1+" and "+numb2+" is : "+add);
         }
}
