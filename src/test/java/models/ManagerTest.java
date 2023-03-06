package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import Interface.implementation.ManagerServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    ManagerServiceImpl implementManager;
    Manager manager;
    Applicant applicant1;
    Cashier cashier1;
    Mall mall1;
    @BeforeEach
    void setUp() {
        implementManager = new ManagerServiceImpl();
        Mall mall1 = new Mall("Target");
         manager  = new Manager("John","Manager", mall1);
         cashier1 = new Cashier("Mary","Cashier1","09321", mall1);
         applicant1 = new Applicant("Nazifi","Applicant",true, 19);

    }

   @org.junit.jupiter.api.Test
   @DisplayName("Manager can hire applicants if their age is between 18 and 30")
    void hireApplicant() {
       Applicant applicant = new Applicant("Nazifi","Applicant",true, 19);
        String expected = "Applicant " + applicant.getName() + " is now hired as a cashier";
       assertEquals(expected, implementManager.hireCashier(applicant1));
   }

    @org.junit.jupiter.api.Test
   void fireCashier() {
         cashier1 = new Cashier("Mary","Cashier1","09321", mall1);
        String expected = "Thank You for your services "  + cashier1.getName() + " You have been relieved of Your Duties";
       assertEquals(expected, implementManager.fireCashier(mall1, cashier1));
    }
}