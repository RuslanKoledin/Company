import part1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Holding holding = new Holding();
        Company company = new Company("");
        Employee employee = new Employee();
        //  company.getEmployees();
        while (true) {
           // Company[] companies = holding.getCompanies();
            System.out.println("1) Holding");
            System.out.println("2) Company");
            System.out.println("3) Employee");
            System.out.println("0) Exit");
            System.out.println("Выберите число:");
            int number = scanner.nextInt();

            if (number == 1) {
                MainMenu.main(holding);
            } else if (number == 2) {
                MainCompany.start(company);
            } else if (number == 3) {
                MainEmployee.start(employee);
            } else if (number == 0) {
                break;
            } else {
                System.out.println("Выберите число из списка!");
            }

        }
    }
}