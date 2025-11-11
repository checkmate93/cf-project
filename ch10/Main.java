package gr.aueb.cf.ch10;

import gr.aueb.cf.ch10.model.*;
import gr.aueb.cf.ch10.model.Customer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"Kolubogios" , "Maxairas");
        User    user    = new User(1, "Costas", "Skarpedas ", "cmask","!2345",true);
        Customer customer = new Customer(1, "andrew", "dmitriou", "0765412", "6988087448", "Attika","athens" , "athens","athens", "76","10534");
        Point point = new Point(0,10);
        Order order = new Order(1,5.5,"meat","Ordered");

        System.out.println("Teacher Full name  "+teacher.getFirstname() + " "+teacher.getLastname());
        System.out.println("User username"+user.getUsername());
        System.out.println("Customer Vat "+customer.getVatRegistrationNo());
        System.out.println("Orderd Timestampt  "+order.getFormattedTimestamp());
        System.out.printf("Point :{%d} {%d}" , point.getX() , point.getY());
    }
}
