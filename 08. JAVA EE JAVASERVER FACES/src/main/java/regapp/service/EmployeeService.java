package regapp.service;


import regapp.domain.entities.Employee;
import regapp.domain.models.service.EmployeeServiceModel;

import java.util.List;

public interface EmployeeService {

    boolean saveEmployee(EmployeeServiceModel employeeServiceModel);

    List<EmployeeServiceModel> findAllEmployees();
}
