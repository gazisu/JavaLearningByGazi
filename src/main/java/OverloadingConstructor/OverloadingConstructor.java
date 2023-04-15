package OverloadingConstructor;

public class OverloadingConstructor {
    public static void main(String[] args) {

        Employee emp10= new Employee();
        System.out.println("\n");
        Employee emp11= new Employee("Gazi Odrika","Manager");
        System.out.println("\n");
        Employee emp13= new Employee(1002,"Gazi Zonnurayen","AVP");


    }
}
