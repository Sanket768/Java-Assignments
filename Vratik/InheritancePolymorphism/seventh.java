/*
 * Create a class Sport. Extend it to Football, Cricket, and Basketball, each with 
their own attributes and methods.
 */
class Sport{
    private int types = 2;
    public void dispTypesOfSport(){
        System.out.println(types);
    }
}
class Football extends Sport{
    private int noOfParticipants = 11;
    public void dispParticipant(){
        System.out.println(noOfParticipants);
    }
}
class Basketball extends Sport{
    private int noOfParticipants = 10;
    public void dispParticipant(){
        System.out.println(noOfParticipants);
    }
}
public class seventh {
    public static void main(String[] args) {
        Basketball bp = new Basketball();
        bp.dispTypesOfSport();
        bp.dispParticipant();
        Football fp = new Football();
        fp.dispTypesOfSport();
        fp.dispParticipant();
    }
}
