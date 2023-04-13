package Class_Object;

public class Employee {
    String Name, PhoneNumber, Address;
    int ID;
    String DOB;
    String DOJ;

    void setEmployeeinformation(int a, String b, String c, String d, String e, String f){
        ID= a;
        Name=b;
        Address=c;
        DOB=d;
        DOJ=e;
        PhoneNumber=f;
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





