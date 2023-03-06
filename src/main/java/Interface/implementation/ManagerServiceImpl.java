package Interface.implementation;

import models.Applicant;
import models.Cashier;
import models.Mall;
import Interface.ManagerService;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    @Override
    public String hireCashier(Applicant applicant) {
        if(applicant.getAge() >= 18 && applicant.getAge() < 30) {
            applicant.setHired(true);
            return "Applicant " + applicant.getName() + " is now hired as a cashier";
        } else  {
            return "Sorry Role not Available for the age limit";
        }
    }

    public ManagerServiceImpl() {

    }

    @Override
    public String fireCashier(Mall mall, Cashier cashier1) {
//        List<Cashier> hello = mall.getCashierList();

        if(cashier1.getName().equals((cashier1.getName()))) {
            Object remove;
            cashier1.remove(cashier1);
            return "Thank You for your services "  + cashier1.getName() + " You have been relieved of Your Duties";
        } else {
            return cashier1.getName() + "Is not a Worker Here";
        }
    }
}
