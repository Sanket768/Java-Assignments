class twentytwo22 {
    private static int num;
    public static void main(String[] args) {
        do{
            num = (int) (Math.random()*50);
            System.out.println(num);
        }
        while(num%7!=0);
    }
}
