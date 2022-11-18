package part1;

import java.util.Scanner;

public class MainCompany {
    public static void start(Company company)
    {
        company = new Company("Amazon" , 4012000,"a");

        Employee employee1 = new Employee("Rus",130000,"JavaDev");
        Employee employee2 = new Employee("Ras",90000,"PythonDev");
        Employee employee3 = new Employee("Ros",40000,"Front");
        Employee employee4 = new Employee("Res",40000,"Front");
        Employee [] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информации о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("5) Поменять руководителя компании");
            System.out.println("6) Меню для работы с сотрудниками");
            System.out.println("7) Найти сотрудника");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
//Реализуйте вывод информации об этой компании (кроме списка сотрудников)
                System.out.println(company );
            } else if (command == 2) {
//Реализуйте вывод списка сотрудников этой компании


            } else if (command == 3) {

//Реализуйте подсчет всех зароботных плат сотрудников
            } else if (command == 4) {
//Реализуйте добавление сотрудника в компанию
            } else if (command == 5) {
//Реализуйте удаление сотрудника из компании
            } else if (command == 6) {
//Реализуйте смену руководителя компании
                System.out.println("Кого сделать руководителем? :");
                String employeeName = in.next();
                Employee foundedEmployee = company.switchSupervisor(employeeName);
                if (foundedEmployee != null) {
                    MainEmployee.start(foundedEmployee);
                } else {
                    System.out.println("Такого человека");
                }
            } else if (command == 7) {
                String employeeName = in.nextLine(); //Реализуйте поиск сотрудника по имени
//P.S. метод getEmployeeByName() пустой нужно его заполнить
                Employee foundedEmployee = company.getEmployeeByName(employeeName);
                // EmployeeMenu.start(foundedEmployee);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Введите пункт из меню!!");
            }
        }
    }
}