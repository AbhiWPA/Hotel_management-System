package View.tm;

import javafx.scene.control.Button;

public class CustomerTM {
    private String cNo;
    private String name;
    private String nic;
    private String tel;
    private String mail;
    private String address;
    private String room;
    private String meal;
    private Button btn;

    public CustomerTM() {
    }

    public CustomerTM(String cNo, String name, String nic, String tel, String mail, String address, String room, String meal, Button btn) {
        this.cNo = cNo;
        this.name = name;
        this.nic = nic;
        this.tel = tel;
        this.mail = mail;
        this.address = address;
        this.room = room;
        this.meal = meal;
        this.btn = btn;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "CustomerTM{" +
                "cNo='" + cNo + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", room='" + room + '\'' +
                ", meal='" + meal + '\'' +
                ", btn=" + btn +
                '}';
    }

}
