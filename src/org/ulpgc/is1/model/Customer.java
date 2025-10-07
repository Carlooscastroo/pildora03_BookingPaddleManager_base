package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private Address address;
    private ArrayList<Reservation> reservationsList;

    public Customer(String name, String surname, String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
        this.reservationsList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Address getAddress() {
        return address;
    }
    public void addReservation(Reservation reservation){
        this.reservationsList.add(reservation);
    }
    public Reservation getReservation(int index){
        return reservationsList.get(index);
    }
}
