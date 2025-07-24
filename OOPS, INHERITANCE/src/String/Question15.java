package String;

import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
class Employee1 {
    private String name;

    public Employee1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Question15 {
    public static void main(String[] args) {
        Employee1 emp = null;
        try {
            Employee1 validEmp = Optional.ofNullable(emp)
                .orElseThrow(() -> new InvalidEmployeeException("Employee is not valid"));

            System.out.println("Employee Name: " + validEmp.getName());

        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}