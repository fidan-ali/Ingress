package model;

public class Guest {
    private int id;
    private String name;
    private Room[] reservedRooms = new Room[2];

    public Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int count = 0;
    public void reserveRoom(Room room){
        room.reserve();
        if(count<=2){
            reservedRooms[count++]=room;
            System.out.println("Reserved the room: " + room.toString());
        }
        else {
            System.out.println("You can only reserve 2 rooms");
        }

    }

    public void printReservedRooms(){
        for(int i=0; i<count; i++){
            System.out.println(reservedRooms[i]);
        }
    }
}
