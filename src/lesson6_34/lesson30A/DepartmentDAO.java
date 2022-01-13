package lesson6_34.lesson30A;

import java.util.*;
import lesson6_34.lesson30A.ENUM.DepartmentType;

public class DepartmentDAO {

    private static Set<Department> department() {
        Set<Department> departmets = new HashSet<>();
        departmets.add(new Department(DepartmentType.MANAGER, EmployeeDAO.getEmployeeManager()));
        departmets.add(new Department(DepartmentType.HR, EmployeeDAO.getEmployeeHr()));
        departmets.add(new Department(DepartmentType.FINANCE, EmployeeDAO.getEmployeeFinance()));
        departmets.add(new Department(DepartmentType.DEVELOPER, EmployeeDAO.getEmployeeDeveloper()));
        departmets.add(new Department(DepartmentType.DESIGNER, EmployeeDAO.getEmployeeDesigner()));
    return departmets;
    }

    public static Set<Department> getDepartmentSet () {
            return department();
    }
}