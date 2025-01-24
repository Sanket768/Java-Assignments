class abcd {
    public void methodOverride(){
        System.out.println("Parent class");
    }
}

class efgh extends abcd {
    public void methodOverride(){
        System.out.println("Child class");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        efgh e = new efgh();
        e.methodOverride();
    }
}
