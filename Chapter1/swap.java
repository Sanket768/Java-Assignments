class swap {
    private static int a = 100;
    private static int b = 230;
    private static int temp;

    public static void sw(){
            System.out.println("Before Swap: " + a + " " + b);
            temp = a;
            a = b;
            b = temp;
            System.out.println("After Swap: " + a + " " + b);
        }
        public static void main(String[] args) {
            sw();
    }
}