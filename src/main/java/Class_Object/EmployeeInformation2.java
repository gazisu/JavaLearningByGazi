package Class_Object;

public class EmployeeInformation2 {
    public static void main(String[] args) {

    //    emp1.ID=1001;
//    emp1.Name = "Sakib";
//    emp1.Address="Dhaka";
//    emp1.DOB= "1 April 1999";
//    emp1.DOJ="1 January 2022";
//    emp1.PhoneNumber="01222333444";
        Employee emp1= new Employee();
        emp1.setEmployeeinformation(1001,"Sakib","Dhaka","1 April 1999","1 January 2022","01222333444");
        emp1.employeeinformation();

    System.out.println("\n");

        Employee emp2= new Employee();
        emp2.setEmployeeinformation(1002,"Odrika","Dhaka","1 April 2016","1 January 2022","01222300999");
//    emp2.ID=1002;
//    emp2.Name = "Odrika";
//    emp2.Address="Dhaka";
//    emp2.DOB= "1 April 2016";
//    emp2.DOJ="1 January 2022";
//    emp2.PhoneNumber="01222300999";
    emp2.employeeinformation();

}
}
