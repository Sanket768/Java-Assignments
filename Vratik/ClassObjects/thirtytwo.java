/*
 * Create a University class with an inner class Department.
 */
class University{
    private String name;
    
    public University(String name){
        this.name = name;
    }

    class Department{
        private String deptName;

        public Department(String deptName){
            this.deptName = deptName;
        }

        public String getDeptName(){
            return deptName;
        }

        public void display(){
            System.out.println("University: " + name + " " + "Department: " + deptName);
        }
    }
}
public class thirtytwo {
    public static void main(String[] args) {
        University uni = new University("Napgur University");
        University.Department dp = uni.new Department("Technical");
        dp.display();
    }
}
