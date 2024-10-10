//Carlinbhert Adryanne De Guzman
//CITCS 1N - A
//CC2 Laboratory 8
//October 10, 2024

class Employee {
//    attributes of the employee are created
    String employeeID;
    String name;
    double hourlyWage;
    double hoursWorked;

//    constructor to initialize employee information
    Employee(String employeeID, String name, double hourlyWage, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

//    salary is calculated by multiplying wage and hours
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

//    employee details are printed
    void displayEmployeeDetails() {
        double employeeSalary = calculateSalary();
        System.out.println("ID: " + employeeID + ", " + "Name: " + name + ", " + "Hourly Wage: " + hourlyWage + ", " + "Hours Worked: " + hoursWorked + ", " + "Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
//        two employee objects are created and their info inputted
        Employee myEmployee1 = new Employee("E001", "Alice Go", 15.0, 160);
        Employee myEmployee2 = new Employee("E002", "Bob Hann", 18.0, 150);

//        employee details are displayed in the output
        System.out.println("Calculating salaries...");
        System.out.println("Employee Details: ");
        myEmployee1.displayEmployeeDetails();
        myEmployee2.displayEmployeeDetails();

    }
}
