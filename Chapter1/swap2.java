class swap2 {
    private static int a = 1;
    private static int b = 2;

    public static void swa(){
        System.out.println("Before Swap: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: " + a + " " + b);
    }
    public static void main(String[] args) {
        swa();
    }
}
