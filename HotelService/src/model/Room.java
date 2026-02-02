package model;

public class Room {
    private int roomNumber;
    private String type;// (Single, Double, Suite);
    private double price;
    private boolean available;

    public Room(int roomNumber, String type, double price, boolean available) {
        this.roomNumber = roomNumber;
        this.type=type;
        this.price=price;
        if (available) this.available = true;
        else this.available = false;
    }

    public void printInfo(){
        System.out.println("RoomNumber: " + roomNumber +
                "type: " + type +
                "price: " + price +
                "Is it available? true or false :" + available);

    }
    public void reserve(){
        if(isAvailable()){
            //guest.reserveRoom(Room);
            available = false;
            System.out.println("Room is available and can be reserved :)");
        }
        else{
            System.out.println("No available Room");
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

    public boolean isAvailable() {
        return available;
    }
}
