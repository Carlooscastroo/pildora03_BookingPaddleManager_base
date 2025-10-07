package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.Date;

public class PaddleManager {
    private ArrayList<Customer> customersList;
    private ArrayList<Court> courtsList;

    public PaddleManager() {
        customersList = new ArrayList<>();
        courtsList = new ArrayList<>();
    }
    public void addMember(String name, String surname, String street, int number, int postalCode, String city, int points){
        this.customersList.add(new Member(name, surname, street, number, postalCode, city, points));
    }
    public void addCustomer(String name, String surname, String street, int number, int postalCode, String city){
        this.customersList.add(new Customer(name, surname, street, number, postalCode, city));
    }
    public Customer getCustomer(int index){
        return customersList.get(index);
    }
    public void addCourt(String name, int price, CourtType type){
        this.courtsList.add(new Court(name, price, type));
    }
    public Court  getCourt(int index){
        return courtsList.get(index);
    }
    public void reserve(Customer customer,  Court court, Date date, int hours){
        Reservation reservation = new Reservation(customer, court, date, hours);
        customer.addReservation(reservation);
        court.addReservation(reservation);
    }
}
