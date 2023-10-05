package com.hotel.in;

public class HotelService {

    private String hotelName;

    private Room[] rooms = new Room[5];

    private Guest[] guests = new Guest[5];

    int guestIndex = 0;
    int roomIndex = 0;

    int count = 0;

    public Guest findGuestCheckedInRoom(int roomNumber){
        for (Room room:rooms) {
            if(room.getRoomNumber()==roomNumber){
                return  room.getGuest();
            }
        }
        return null;
    }

    public int guestCount(){
        for (Room room:rooms) {
            if(room.getGuest()!=null){
                count++;
            }
        }
        return count;
    }

    public double earningToday(){
        double earning = 0.0;
        for (Room room:rooms) {
            if(room!=null){
                earning += room.getPricePerDay();
            }
        }
        return earning;
    }

    public Guest[] findAllGuests(){
        for (Room room:rooms) {
            if(room!=null){
                guests[guestIndex] = room.getGuest();
                guestIndex++;
            }

        }
        return guests;
    }

    public void assignRoomToGuest(Room room){
        rooms[roomIndex] = room;
        roomIndex++;
    }
}