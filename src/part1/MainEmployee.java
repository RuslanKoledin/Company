package part1;

import java.util.Scanner;

public class MainEmployee {

    public static void start(Employee employee) {


        Employee employee1 = new Employee("Rus",130000,"JavaDev");
        Employee employee2 = new Employee("Ras",90000,"PythonDev");
        Employee employee3 = new Employee("Ros",40000,"Front");
        Employee employee4 = new Employee("Res",40000,"Front");
        Employee [] employees = new Employee[4];


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) Вывод информации о сотрудникaх");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
//Реализуйте вывод информации о сотруднике
                System.out.println(employee1);
                System.out.println(employee2);
                System.out.println(employee3);
                System.out.println(employee4);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }


    }

}
