package week1.day2;



public class Car {
	public void printCarBrandName() 
	{
		System.out.println("Ford");
	}
public int getcarRegNumber() 
{
	int Reg = 5713;
	return Reg;
	
}

public double mulThreeNumbers(int a, int b, int c) 
{
	
	return a*b*c;
}

public String getCarModel() 
{
	return "ecosport";
}
	
public  boolean gettyreStatus()
{

	boolean isPuncture= false;
	return isPuncture;
}


public static void main(String[] args) {
	Car obj=new Car();
	obj.printCarBrandName();
	int Reg = obj.getcarRegNumber(); 
	System.out.println(Reg);
	double result= obj.mulThreeNumbers(2, 2, 2);
	System.out.println(result);
	String carModel= obj.getCarModel();
	System.out.println(carModel);
	boolean isPuncture= obj.gettyreStatus();
	System.out.println(isPuncture);
			
}
}

	
