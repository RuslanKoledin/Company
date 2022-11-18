package part1;

import java.util.Scanner;

public class MainMenu {
    public static void main(Holding holding) {
        Scanner in = new Scanner(System.in);
        Employee employee1 = new Employee("Rus",130000,"JavaDev");
        Employee employee2 = new Employee("Ras",90000,"PythonDev");
        Employee employee3 = new Employee("Ros",40000,"Front");
        Employee employee4 = new Employee("Res",40000,"Front");
        Employee [] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        while (true) {
            System.out.println("Главне меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже" +
                    " работающих сотрудников");
            System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");

            System.out.println("Выберите число из меню : ");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Список компаний :");
                holding.showCompanies();
            } else if (command == 2) {
                System.out.println("Бюджет холдинга:");
                holding.getOverallBudget();

            } else if (command == 3) {

//Реализуйте подсчет всех работающих сотрудников и общее количестов рабочих мест во всех компаниях
//P.S. Если в employees есть ячейка null это значит что место вакантно и там нет сотрудника
                holding.getEmployeeList(employees);
            } else if (command == 4) {
                 System.out.println("Имя компании :");
                String name = in.next();

                System.out.println("Имя владельца компании :");
                String supervisor = in.next();

                System.out.println("бюджет :");
                double budget = in.nextDouble();
                holding.addCompany(new Company(name,employees,budget,supervisor));

                holding.addCompany(new Company("Amazon",employees,14,employees[0].getName()));
                holding.addCompany(new Company("Meta",employees,14,employees[1].getName()));
                holding.addCompany(new Company("Google",employees,14,employees[2].getName()));

            } else if (command == 5) {
                System.out.println("Название компании которую надо удалить :");
                String companyName = in.next();
                holding.deleteCompany(companyName);

            } else if (command == 6) {
                System.out.println("Название компании , которую вы хотите найти :");
                String name = in.next();
                Company foundedCompany = holding.getCompanyByName(name);

                if (foundedCompany != null){
                MainCompany.start(foundedCompany);

                }else {
                    System.out.println("Такой компании нет");
                }

            } else if (command == 0) {
                break;

            } else {
                System.out.println("Введите пункт из меню!!");
            }
        }
    }
}
