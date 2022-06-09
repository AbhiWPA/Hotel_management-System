package View.tm;

import javafx.scene.control.Button;

public class AdminRoomTM {
     private String roomNo;
     private String roomType;
     private Button btn;

    public AdminRoomTM() {
    }

    public AdminRoomTM(String roomNo, String roomType, Button btn) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "AdminRoomTM{" +
                "roomNo='" + roomNo + '\'' +
                ", roomType='" + roomType + '\'' +
                ", btn=" + btn +
                '}';
    }
}
