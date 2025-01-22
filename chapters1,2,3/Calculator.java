
import java.util.*;
public class Calculator {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		float num1=scanner.nextFloat();
		System.out.println("Enter the operator (+,-,*,/)");
		char ope=scanner.next().charAt(0);
		System.out.println("Enter the second number");
		float num2=scanner.nextFloat();
		float res=0;
		switch(ope)
		{
			case '+':
				res=num1+num2;
				System.out.println(num1+"+"+num2+"="+res);
				break;
			case '-':
				res=num1-num2;
				System.out.println(num1+"-"+num2+"="+res);
				break;
			case '*':
				res=num1*num2;
				System.out.println(num1+"*"+num2+"="+res);
				break;
			case '/':
				res=num1/num2;
				System.out.println(num1+"/"+num2+"="+res);
				break;
			default:
				System.out.println("Invalid Operator");
		        break;
		}
	}

}
