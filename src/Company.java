import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7]; 

        
        employees[0] = new Manager("Andrzej Kowalski", 80000);
        employees[1] = new Worker("Adam jędrowski", 60000);
        employees[2] = new Employee("Janusz Trochowski", 70000);
        employees[3] = new Worker("Jakub Rozbicki", 55000);
        employees[4] = new Manager("Dawid Jeleniewski", 48000);
        employees[5] = new Manager("Sara Grąkowska", 65000);
        employees[6] = new Worker("Tomasz Broda", 52000);

        
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(2);
                manager.setSalary(75000);
            }
        }

        
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
