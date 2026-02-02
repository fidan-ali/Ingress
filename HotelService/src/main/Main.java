package main;


import model.Guest;
import model.Room;
import service.HotelService;

public class Main {
    public static void main(String[] args) {
        HotelService hotel = new HotelService();
        Room room1 = new Room(1, "Single",100.0,true);
        Room room2 = new Room(2, "Double",200.0,false);
        Room room3 = new Room(3, "Suite",150.0,true);

        Guest guest1 = new Guest(1, "Ali");
        guest1.reserveRoom(room1);
        hotel.addRoom(room1);
        hotel.listAvailableRooms();


    }
}