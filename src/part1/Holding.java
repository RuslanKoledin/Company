package part1;

public class Holding {
    private Company[] companies;

    public Holding() {
        companies = new Company[3];
        Company company = new Company("Amazon", new Employee[]{employee1},4012000,"a");
        Company company1 = new Company("Meta", new Employee[]{employee2},200002,"b");
        Company company2 = new Company("Amazon", new Employee[]{employee3},4000,"c");
        companies[0] = company;
        companies[1] = company1;
        companies[2] = company2;
    }
    //добавил объекты с мэин меню для проверки
    Employee employee1 = new Employee("Rus",130000,"JavaDev");
    Employee employee2 = new Employee("Ras",90000,"PythonDev");
    Employee employee3 = new Employee("Ros",40000,"Front");




    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }
    public void deleteCompany(String nameCompany) {
        for (int i = 0; i < companies.length; i++) {
            if(this.companies[i] != null && this.companies[i].getName().equals(nameCompany)){
                System.out.println(this.companies[i].getName()+" компания удалена");
                this.companies[i] = null;

            }
        }
    }

    public void showCompanies() {
        Company[] companies = this.companies;
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company);
            }else
                 System.out.println("компаний в холдинге нет !");
        }
    }

    public Company getCompanyByName(String companyName) {
        Company[] company = this.companies;
        for (int i = 0; i < company.length; i++) {
            if (company[i] != null && company[i].getName().equals(companyName)) {
                System.out.println("Компания :" + company[i].toString());
                return company[i];
            }
        }
        return null;
    }
    public void getEmployeeList(Employee[] employees) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                count++;
            }else {
                count2++;
            }
        }
        System.out.println("рабочих мест : " + count);
        System.out.println("вакантных мест : " + count2);

    }
    public void getOverallBudget(){
        double count = 0 ;
        for (int i = 0; i < companies.length ; i++) {
            if (companies[i] != null ){
                count = count + companies[i].getBudget();
            }
        }
        System.out.println(count);
    }

}