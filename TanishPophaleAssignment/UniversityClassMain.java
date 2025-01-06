// Create a University class with an inner class Department.



class UniversityClassMain{

    public String universityName;

    UniversityClassMain(String univerityName){
        this.universityName = univerityName;
    }
    
    public void getUniversityName(){
        System.out.println("The University name is: " + this.universityName);
    }


    class Department{
        private String departmentname;
        private int noOfFaculty;

        public Department(String departmentname, int noOfFaculty){
            this.departmentname = departmentname;
            this.noOfFaculty = noOfFaculty;
        }

        public void getDepartmentName(){
            System.out.println("The department name is: " + this.departmentname);
        }

        public void getNoOfFaculty(){
            System.out.println("The no of faculties are: " + noOfFaculty);
        }

        public void displayInfo(){
            System.out.println("The details of the university are: ");
            System.out.println("University Name: " + universityName);
            System.out.println("Department Name: " + this.departmentname);
            System.out.println("No of Faculty: " + this.noOfFaculty);

        }
    }

    public static void main(String[] args) {
        
        UniversityClassMain universityClass = new UniversityClassMain("Pune University");

        Department department = universityClass.new Department("CSE", 126);

        department.getDepartmentName();
        department.getNoOfFaculty();

        System.out.println("");

        department.displayInfo();
        
    }

}


    
    

