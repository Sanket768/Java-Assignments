/* Demonstrate exception propagation in a class method. */
class TestExceptionPropagation {
    public void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception caught in methodA: " + e.getMessage());
        }
    }

    public void methodB() throws Exception {
        throw new Exception("Exception thrown from methodB");
    }

    public static void main(String[] args) {
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.methodA();
    }
}