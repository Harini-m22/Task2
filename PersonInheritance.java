package task2;

class PersonInheritance {
    // Attributes of Person
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public PersonInheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Employee (inherits from Person)
class Employee extends PersonInheritance {
    // Additional attributes of Employee
    private String employeeID;
    private double salary;

    // Constructor to initialize Employee along with Person attributes
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);  // Call to Person constructor to initialize name and age
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details (including inherited Person details)
    public void displayEmployeeDetails() {
        // Display the Person attributes first
        displayPersonDetails();
        // Then display the Employee-specific attributes
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 30, "E12345", 75000);

        // Displaying Employee details
        emp.displayEmployeeDetails();
    }
}

//OUTPUT
//Name: John Doe
//Age: 30
//Employee ID: E12345
//Salary: 75000.0