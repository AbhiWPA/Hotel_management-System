package View.tm;


import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

public class RoomsTM {
   private String roomNo;
   private String roomType;
   private CheckBox cbx;
   private ComboBox cmbx;

    public RoomsTM() {
    }

    public RoomsTM(String roomNo, String roomType, CheckBox cbx, ComboBox cmbx) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.cbx = cbx;
        this.cmbx = cmbx;
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

    public CheckBox getCbx() {
        return cbx;
    }

    public void setCbx(CheckBox cbx) {
        this.cbx = cbx;
    }

    public ComboBox getCmbx() {
        return cmbx;
    }

    public void setCmbx(ComboBox cmbx) {
        this.cmbx = cmbx;
    }

    @Override
    public String toString() {
        return "RoomsTM{" +
                "roomNo='" + roomNo + '\'' +
                ", roomType='" + roomType + '\'' +
                ", cbx=" + cbx +
                ", cmbx=" + cmbx +
                '}';
    }
}
