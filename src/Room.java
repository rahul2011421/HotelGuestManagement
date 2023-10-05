package com.hotel.in;

public class Room {

    private int roomNumber;
    private int floor;
    private Guest guest;
    private String roomType;
    private double pricePerDay;

    public Room(int roomNumber, int floor, Guest guest, String roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.guest = guest;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}