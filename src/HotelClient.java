package com.hotel.in;

public class HotelClient {

    public static void main(String[] args) {

        HotelService hotelService = new HotelService();
        hotelService.assignRoomToGuest(new Room(1,1,new Guest(1,"Rahul","Yadav","rahul@gmail.com"),"premium",35342000));
        hotelService.assignRoomToGuest(new Room(2,1,new Guest(2,"Mayank","Mishra","mayank@gmail.com"),"regular",3453500));
        hotelService.assignRoomToGuest(new Room(3,1,new Guest(3,"kumar","Annie","annie@gmail.com"),"deluxe",65312040));
        hotelService.assignRoomToGuest(new Room(5,2,new Guest(4,"Amresh","M","amresh@gmail.com"),"regular",3213050));
        hotelService.assignRoomToGuest(new Room(6,2,new Guest(5,"Kushal","N","kushal@gmail.com"),"premium",40565030));

        Guest guest = hotelService.findGuestCheckedInRoom(5);
        System.out.println("Guest who checked in is::"+guest.getFirstName()+" "+guest.getLastName());

        int totalNoOfGuest = hotelService.guestCount();
        System.out.println("Total number of Guest::"+totalNoOfGuest);

        double earned = hotelService.earningToday();
        System.out.println("Total earnings of today::"+earned);

        Guest[] guests = hotelService.findAllGuests();
        for (Guest guest1:guests) {
            System.out.println("Guests in Hotel::"+guest1.getFirstName()+" "+guest1.getLastName());
        }

    }



}