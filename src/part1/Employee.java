package part1;

public class Employee {
        private String name;
        private int salary;
        private String jobTitle;

        public Employee(String name, int salary, String jobTitle) {
            this.name = name;
            this.salary= salary;
            this.jobTitle = jobTitle;
        }
        public Employee() {}
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

