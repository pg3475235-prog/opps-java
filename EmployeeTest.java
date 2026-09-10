class Employee{
    private String name;
    private int id;
    private int salary;
    private String  department;

    static String companyName = "ABC Technologies";
    static int employeeCount = 0;


    Employee(String name, int id, int salary, String department){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}


public class EmployeeTest { 

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, 45000, "IT");
        Employee e2 = new Employee("Neha", 102, 55000, "HR"); 

        System.out.println("Employee 1:");
        System.out.println("Name: " + e1.getName());
        System.out.println("ID: " + e1.getId());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Department: " + e1.getDepartment());

        System.out.println();

        // Employee 2
        System.out.println("Employee 2:");
        System.out.println("Name: " + e2.getName());
        System.out.println("ID: " + e2.getId());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Department: " + e2.getDepartment());

        System.out.println();

        System.out.println("Company: " + Employee.companyName);
        System.out.println("Total Employees: " + Employee.employeeCount);
}
 }