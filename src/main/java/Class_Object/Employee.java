package Class_Object;

public class Employee {
    String Name, PhoneNumber, Address;
    int ID;
    String DOB;
    String DOJ;

    public Employee(int ID, String name, String address,  String DOB, String DOJ, String PhoneNumber) {
        this.Name = name;
        this.Address = address;
        this.ID = ID;
        this.DOB = DOB;
        this.DOJ = DOJ;
        this.PhoneNumber= PhoneNumber;
    }

    public Employee(int ID, String name, String phoneNumber) {
        this.ID = ID;
        Name = name;
        PhoneNumber = phoneNumber;

    }

    void employeeinformation(){
    System.out.println("ID "+ID);
    System.out.println("Name "+Name);
    System.out.println("Address "+Address);
    System.out.println("DOB " +DOB);
    System.out.println("DOJ "+DOJ);
    System.out.println("Mobile Number: "+PhoneNumber);
}
    }





