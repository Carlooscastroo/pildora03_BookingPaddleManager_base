package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Court {
    private String name;
    private int price;
    private CourtType type;
    private ArrayList<Reservation> reservationsList;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.reservationsList = new ArrayList<>();
    }
    public void addReservation(Reservation reservation) {
        reservationsList.add(reservation);
    }
    public int getPrice() {
        return price;
    }
    public CourtType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
