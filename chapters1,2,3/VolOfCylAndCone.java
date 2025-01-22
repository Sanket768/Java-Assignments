
import java.util.*;
public class VolOfCylAndCone {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder and the cone");
		double radiusCyl=scanner.nextDouble();
		double radiusCone=scanner.nextDouble();
		System.out.println("Enter the height of the cylinder and the cone");
		double heightCyl=scanner.nextDouble();
		double heightCone=scanner.nextDouble();
		double volCyl=Math.PI*radiusCyl*radiusCyl*heightCyl;
		double volCone=(1/3)*Math.PI*radiusCone*radiusCone*heightCone;
		System.out.println("The volumes of the cylinder and cone are "+volCyl+" and "+volCone+" respectively");
	}

}
