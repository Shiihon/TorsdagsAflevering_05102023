package Task_01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Nadia", "Hamza", "Shiihon"));
        customers.add(new Customer("Sander", "Christensen", "DinMor123"));
        customers.add(new Customer("Victor", "Dencker", "Shaffyse"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer customer: customers){
            System.out.println(customer);
        }
    }
}



