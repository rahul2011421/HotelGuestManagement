# HotelGuestManagement_Task_4


Create a guest management task for hotel



Assume there are 8 rooms in a hotel, 4 rooms in every floor

Create a main class HotelClient to test your application is working

Details below

package com.mavericapps.hotelms


com.mavericapps.hotelms.domain
Guest{

id:long
firstName:String
lastName:String
emailId: String

}

Room{

roomNumber:int
floor:int
checkedIn:Guest
roomType: String // deluxe or normal
pricePerDay: double
}

Hotel{
id: long
name: String
rooms: Room[]

}

com.mavericapps.hotelms.service
interface
IHotelService{
findGuestCheckedInRoom(hotelId,roomId): Guest
guestsCount(hotelId): int
earningToday(hotelId): double // add prices of rooms where guest is staying
findAllGuests(hotelId): Guest[]
}

create service implementation , keep hotel service implementation
HotleServiceImpl implements IHotelService{
----
----
}


com.mavericapps.hotelms.ui
Front end class to display the operations

AppClient{
----
}







