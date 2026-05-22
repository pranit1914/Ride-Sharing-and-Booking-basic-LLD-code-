class Employee {
    private String name;
    private double basicSalary;

    // Constructor
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate tax
    public double calculateTax() {
        double tax = 0;

        if (basicSalary <= 250000) {
            tax = 0;
        } else if (basicSalary <= 500000) {
            tax = basicSalary * 0.10;
        } else if (basicSalary <= 1000000) {
            tax = basicSalary * 0.20;
        } else {
            tax = basicSalary * 0.30;
        }

        return tax;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        double tax = calculateTax();
        return basicSalary - tax;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Tax Deducted: " + calculateTax());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Samarth", 600000);

        emp1.displayDetails();
    }
}