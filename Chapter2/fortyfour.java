class fortyfour {
    public static void main(String[] args) {
        try {
            for(int i=60;i>=0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
