package service;

import model.Room;

public class HotelService {
    private Room[] Rooms = new Room[3];
    static int totalRooms=0;

    public void addRoom(Room room){
        Rooms[totalRooms++]=room;
    }
    public void listAvailableRooms(){
        for(int i=0; i<totalRooms; i++){
            System.out.println(Rooms[i]);
        }
    }
}
