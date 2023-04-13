package Class_Object;

import javax.print.DocPrintJob;

public class EmployeeInformamtion {
    public static void main(String[] args) {

        Employee emp1= new Employee();
        emp1.ID=1001;
        emp1.Name = "Sakib";
        emp1.Address="Dhaka";
        emp1.DOB= "1 April 1999";
        emp1.DOJ="1 January 2022";
        emp1.PhoneNumber="01222333444";

        System.out.println("ID "+emp1.ID);
        System.out.println("Name "+ emp1.Name);
        System.out.println("Address "+emp1.Address);
        System.out.println("DOB " + emp1.DOB);
        System.out.println("DOJ "+ emp1.DOJ);
        System.out.println("Mobile Number: "+emp1.PhoneNumber);

    }
}
