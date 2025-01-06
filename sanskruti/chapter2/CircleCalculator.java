/* find the area and circumference of a circle using arithmatic expressions */
package chapter2;

public class CircleCalculator {
    public static void main(String[]args){
        int radius = 5;
        int  area = (int)  (Math.PI* radius * radius);
        int circumference = (int)(2 * Math.PI * radius);
        System.out.println("AREA OF CIRCLE : "+ area);
        System.out.println("CIRCUMFERENCE OF CIRCLE :"+ circumference);
        
    }
    
}
