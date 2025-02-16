package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee implements Serializable {
    // Removed serialVersionUID and no private modifier on fields

    int id;
    String name;
    String department;
    double salary;

    // Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter method for displaying data
    @Override
    public String toString() {
        return "Employee { ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary + " }";
    }
}

public class EmployeeSerialization {
    static final String FILE_NAME = "employees.ser"; // Made it package-private

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "HR", 50000));
        employees.add(new Employee(2, "Jane Smith", "IT", 70000));
        employees.add(new Employee(3, "Sam Wilson", "Finance", 60000));

        // Serialize the employee list to a file
        serializeEmployees(employees);

        // Deserialize the employee list from the file
        List<Employee> deserializedEmployees = deserializeEmployees();

        // Display deserialized employees
        if (deserializedEmployees != null) {
            System.out.println("Deserialized Employees:");
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }

    // Method to serialize the list of employees
    static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize the list of employees
    static List<Employee> deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            @SuppressWarnings("unchecked")
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Employees have been deserialized from " + FILE_NAME);
            return employees;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
        return null;
    }
}
