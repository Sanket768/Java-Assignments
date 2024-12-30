//Adding final keyword before a class restricts the class to be extended further
final class fk {
    //We can increment the value of a in the loop as of now. If we use final keyword while declaring variable, we wont be able to update the value
    private int a = 10;
    
    //In a method, if we use final keyword as prefix, we will not be able to override that method further
    public void fn(){
        for (int i=0;i<=10;i++){
            a++;
            System.out.println(a);
        }
    }
}

class finalKeyword {
    public static void main(String[] args) {
        fk f = new fk();
        f.fn();
    }
}
