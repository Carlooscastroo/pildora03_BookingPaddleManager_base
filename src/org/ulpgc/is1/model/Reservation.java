package org.ulpgc.is1.model;
import java.util.Date;

public class Reservation {
    private static int nextId = 0;
    private final int id;
    private Date date;
    private int hours;
    private Customer customer;
    private Court court;

    public Reservation( Customer customer, Court court, Date date, int hours) {
        this.id = nextId++;
        this.date = date;
        this.hours = hours;
        this.customer = customer;
        this.court = court;
    }

    public int price(){
        return hours*court.getPrice();
    }
}
