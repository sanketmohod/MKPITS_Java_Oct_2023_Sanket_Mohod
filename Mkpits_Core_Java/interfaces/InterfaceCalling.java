package com.mkpits.interfaces;

public class InterfaceCalling implements AddOperation, SubOperation, AreaTriengle, AreaOfRectangle {
       // Interface - is fully abstract class that help in java abstraction
	   // it consist of class member(variable, method)
	   // basically use for data hiding 
	   // it provide pure abstracting (by default all methods are abstract)
	   // Methods doesn't have body as it provide 100% abstraction 
	   // we can't create object of interface( bcoz interface only the collection methods with no body and there is no constructor present and without constructor we can not create the object   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceCalling inter = new InterfaceCalling();
		inter.getAdd();
		inter.getSub(55, 41);
		inter.getArea();
		inter.getData(25, 65);
	}

	@Override
	public void getData(int length, int breangth) {
		int areaRect = length + breangth;
		System.out.println("Area og rectangle is : "+areaRect);
		
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		float areaTriengle = (length+brength)/2;
		System.out.println("Area of triengle is : "+areaTriengle);
	}

	@Override
	public void getSub(int numb1, int numb2) {
		// TODO Auto-generated method stub
		int sub = numb1 - numb2;
		System.out.println("Subtraction of "+numb1+" and "+numb2+" is : "+sub);
	}

	@Override
	public void getAdd() {
		// TODO Auto-generated method stub
		int add = numb1 + numb2;
		System.out.println("Addition of "+numb1+" and "+numb2+" is : "+add);
	}

}
