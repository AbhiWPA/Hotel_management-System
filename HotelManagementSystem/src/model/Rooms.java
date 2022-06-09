package model;

public class Rooms {
    private String roomNo;
    private String roomType;

    public Rooms() {
    }

    public Rooms(String roomNo, String roomType) {
        this.roomNo = roomNo;
        this.roomType = roomType;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "roomNo='" + roomNo + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
