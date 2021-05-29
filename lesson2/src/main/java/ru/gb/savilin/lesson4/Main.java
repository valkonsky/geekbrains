package ru.gb.savilin.lesson4;

public class Main {

    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Jhon Doe","developer", "jhondoe@hornsandhoofs.com","89000000000",1000,27);
        employees[1] = new Employee("Dave Doe","developer", "davedoe@hornsandhoofs.com","89000000001",1100,37);
        employees[2] = new Employee("Kevin Doe","manager", "paperrat@hornsandhoofs.com","89000000002",2000,41);
        employees[3] = new Employee("Terry Doe","manager", "terrydoe@hornsandhoofs.com","89000000003",3000,42);
        employees[4] = new Employee("Arnold Doe","ceo", "arnolddoe@hornsandhoofs.com","89000000004",10000,44);


        for (int i = 0; i<employees.length;i++){
            if (employees[i].getAge()>40){
                System.out.println(employees[i].toString());
            }
        }
    }
}
