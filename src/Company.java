import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        
        employees[0] = new Manager("Andrzej Kowalski", 80000);
        employees[1] = new Worker("Adam jędrowski", 60000);
        employees[2] = new Employee("Janusz Trochowski", 70000);
        employees[3] = new Worker("Jakub Rozbicki", 55000);
        employees[4] = new Manager("Dawid Jeleniewski", 48000);

        
        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);

        
        employees[0].setSalary(75000);

        
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
