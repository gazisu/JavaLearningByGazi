package OverloadingConstructor;

public class Employee {
    int id;
    String name, designation;

    public Employee() {
        System.out.println("No information");
            }

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }
    void displayinformation(){
        System.out.println("ID: "+id);

        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
    }
}
