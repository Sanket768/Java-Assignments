/* Create a University class with an inner class Department. */

class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void display() {
            System.out.println("University: " + name + ", Department: " + departmentName);
        }
    }
}