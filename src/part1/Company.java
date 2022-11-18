package part1;

public class Company {

    private String name;
    private Employee[] employees;
    private double budget;
    private String supervisor;

    public Company(String name,double budget,String supervisor) {
        this.name = name;
        this.budget =budget;
        this.supervisor =supervisor;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Employee[] employees,double budget,String supervisor) {
        this.name = name;
        this.employees = employees;
        this.budget =budget;
        this.supervisor =supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Employee getEmployeeByName(String name) {
        /*Employee [] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                employees[i] = name;

            }

        }*/
        return null;
    }

    public Employee switchSupervisor(String name){
        Employee [] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                this.supervisor =employees[i].getName();
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "name = " + name +  " | "  +
                " budget = " + budget +
                " |  supervisor = "+ supervisor + "\n";
    }
}
