

public class Calculator {
	private float num1;
	private float num2;
	public Calculator(float num1,float num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void sum()
	{
		float sum=num1+num2;
		System.out.println("The sum is "+sum);
	}
	public void diff()
	{
		float diff=num1-num2;
		System.out.println("The difference is "+diff);
	}
	public void pro()
	{
		float pro=num1*num2;
		System.out.println("The product is "+pro);
	}
	public void div()
	{
		if(num2!=0)
		{
			float div=num1/num2;
			System.out.println("The division is "+div);
		}
		else
		{
			System.out.println("Division by zero is invalid");
		}
	}
	public static void main(String[] args) 
	{
		Calculator cal=new Calculator(10,5);
		cal.sum();
		cal.diff();
		cal.pro();
		cal.div();
	}

}
