/* Demonstate the type casting (implicit and explicit) between  int ,float and double */


public class TypeCasting {
    public static void main(String[]args){
       int  intValue = 100;
       double doubleValue = intValue;
       System.out.println("implicit casting :int to double = " + doubleValue);

       double anotherdouble = 99.99;
       int  anotherint = (int ) anotherdouble;
       System.out.println("explicit casting : double to int " + anotherint);

       float floatvalue =(float) anotherdouble;
       System .out.println("explicit casting : double to float "+ floatvalue);

    }

    
}
