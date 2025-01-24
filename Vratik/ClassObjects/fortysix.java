/* Create a Pizza class using the Builder design pattern. */
class Pizza{
    private String dough = "";
    private String sauce = "";
    private String topping = "";
    public Pizza(){
        
    }
    public String getDough(){
        return dough;
    }
    public String getSauce(){
        return sauce;
    }
    public String getTopping(){
        return topping;
    }
    public void setDough(String dough){
        this.dough = dough;
    }
    public void setSauce(String sauce){
        this.sauce = sauce;
    }
    public void setTopping(String topping){
        this.topping = topping;
    }
    public String toString(){
        return "Dough: "+dough+" Sauce: "+sauce+" Topping: "+topping;
    }
    public static class Builder{
        private String dough = "";
        private String sauce = "";
        private String topping = "";
        public Builder(){
            
        }
        public Builder setDough(String dough){
            this.dough = dough;
            return this;
        }
        public Builder setSauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public Builder setTopping(String topping){
            this.topping = topping;
            return this;
        }
        public Pizza build(){
            Pizza pizza = new Pizza();
            pizza.setDough(dough);
            pizza.setSauce(sauce);
            pizza.setTopping(topping);
            return pizza;
        }
    }
}
public class fortysix {
    public static void main(String[] args){
        Pizza pizza = new Pizza.Builder().setDough("Wheat").setSauce("Tomato").setTopping("Cheese").build();
        System.out.println(pizza);
    }
}
