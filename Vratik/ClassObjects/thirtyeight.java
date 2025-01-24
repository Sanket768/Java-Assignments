public class thirtyeight {
    void method1() throws Exception{
        throw new Exception("Exception in method1");
    }

    void method2() throws Exception{
        method1();
    }

    void method3(){
        try{
            method2();
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        thirtyeight obj = new thirtyeight();
        obj.method3();

    }
}
