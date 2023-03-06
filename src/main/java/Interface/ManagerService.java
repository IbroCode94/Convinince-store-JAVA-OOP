package Interface;

import models.Applicant;
import models.Cashier;
import models.Mall;

public interface ManagerService {
    String hireCashier(Applicant applicant);
    String fireCashier(Mall mall, Cashier cashier);
}
