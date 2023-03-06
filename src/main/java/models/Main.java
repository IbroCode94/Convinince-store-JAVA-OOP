package models;

import Interface.implementation.ManagerServiceImpl;

public class Main {
    public static void main(String[] args) {
        Mall mall1 = new Mall("Target");
        Manager manager = new Manager("John","Manager",mall1);
        Products diaper = new Products("Huggies",300, 12);
        Products belt= new Products("Gucci", 1500, 3);
        Products iceCream = new Products("ColdStone", 7500, 3);
        Applicant applicant1 = new Applicant("Nazifi","Applicant",true, 19);

        Cashier cashier1 = new Cashier("Mary","Cashier1","09321", mall1);

        Cashier cashier2 = new Cashier("Sanusi", "Cashier2","097B", mall1);

        Customer customer1 = new Customer("Bright",10000,"Biscuits");
        customer1.addGoods(diaper,2);
        Customer customer2 = new Customer("Mattew",3000, "Sweet");
        customer2.addGoods(belt,3);

        cashier1.payBill(customer1);
        cashier2.payBill(customer2);
        customer1.payForGoods(7600);
        customer1.payForGoods(1000);

        ManagerServiceImpl managerService = new ManagerServiceImpl();
        System.out.println(managerService.hireCashier(applicant1));
        System.out.println(managerService.fireCashier(mall1, cashier2));
    }

}