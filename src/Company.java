
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        
        employees[0] = new Employee("John Smith", 50000);
        employees[1] = new Employee("Alice Johnson", 60000);
        employees[2] = new Employee("Michael Jordan", 70000);
        employees[3] = new Employee("Emily Davis", 55000);
        employees[4] = new Employee("David Lee", 48000);

        
        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

       
        employees[3].setSalary(60000);

  
        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
