// Program to check whether the triangle is valid or not using ineuility theorem

import java.util.Scanner;


class isValidTriangle{
    
        public boolean isValid(int side1, int side2, int side3){
            if( (side1 + side2 >= side3) || (side2 + side3 >= side1) || (side1 + side2 >= side3) ){
                return true;
            }
            else{
                return false;
            }
        }
}


class ValidTriangle{    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle: ");
        int side1 = sc.nextInt();

        System.out.println("Enter the second side of the traiangle: ");
        int side2 = sc.nextInt();

        System.out.println("Enter the third side of the triangle: ");
        int side3 = sc.nextInt();

        isValidTriangle validTriangle = new isValidTriangle();
        boolean isValid = validTriangle.isValid(side1, side2, side3);

        if(isValid){
            System.out.println("The triangle is valid.");
        }
        else{
            System.out.println("The triangle isnot valid.");
        }
    }
}
