package db;

import model.Bill;
import model.Customer;
import model.Rooms;
import model.Meal;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Customer> customerTable = new ArrayList<Customer>();
    public static ArrayList<Rooms> roomsTable= new ArrayList<Rooms>();
    public static ArrayList<Meal> mealTable= new ArrayList<Meal>();
    public static ArrayList<Bill> billTable= new ArrayList<Bill>();
    private static Customer top;


    static {
        mealTable.add(
                new Meal("ML001","Local","Chicken-Rice & curry","Rs. 350.00")
        );

        mealTable.add(
                new Meal("ML002","Local","Fish-Rice & Curry","Rs. 250.00")
        );

        mealTable.add(
                new Meal("ML003","Local","Egg-Rice & Curry","Rs. 180.00")
        );

        mealTable.add(
                new Meal("ML004","Local","Milk Rice","Rs. 25.00")
        );

        mealTable.add(
                new Meal("ML005","Local","String Hoppers","Rs. 45.00")
        );

        mealTable.add(
                new Meal("ML006","Local","Hoppers","Rs. 15.00")
        );

        mealTable.add(
                new Meal("ML007","Local","Pittu","Rs. 35.00")
        );

        mealTable.add(
                new Meal("ML008","Local","Those","Rs. 35.00")
        );

        mealTable.add(
                new Meal("ML009","Local","Tea","Rs. 35.00")
        );

        mealTable.add(
                new Meal("ML010","Local","Coffee","Rs. 30.00")
        );

        mealTable.add(
                new Meal("ML011","Local","Kolakenda","Rs. 50.00")
        );

        mealTable.add(
                new Meal("MC001","Chinese","Chicken Fried Rice","Rs. 450.00")
        );

        mealTable.add(
                new Meal("MC002","Chinese","Fish Fried Rice","Rs. 300.00")
        );

        mealTable.add(
                new Meal("MC003","Chinese","Egg Fried Rice","Rs. 250.00")
        );

        mealTable.add(
                new Meal("MC004","Chinese","Nixed Fried Rice","Rs. 750.00")
        );

        mealTable.add(
                new Meal("MC005","Chinese","Chicken Noodles","Rs. 550.00")
        );

        mealTable.add(
                new Meal("MC006","Chinese","Vegetable Noodles","Rs. 450.00")
        );

        mealTable.add(
                new Meal("MC007","Chinese","Mixed Noodles","Rs. 650.00")
        );

        mealTable.add(
                new Meal("MC008","Chinese","Vegetable Soup","Rs. 450.00")
        );

        mealTable.add(
                new Meal("MC009","Chinese","Chicken Soup","Rs. 550.00")
        );

        mealTable.add(
                new Meal("MC0010","Chinese","Tomato Soup","Rs. 500.00")
        );

        mealTable.add(
                new Meal("MC011","Chinese","Egg & Noodles","Rs. 650.00")
        );

        mealTable.add(
                new Meal("MC012","Chinese","Sea Food Soup","Rs. 700.00")
        );


        mealTable.add(
                new Meal("MF001","French","Egg Sandwich","Rs. 250.00")
        );

        mealTable.add(
                new Meal("MF002","French","Chicken Sandwich","Rs. 300.00")
        );

        mealTable.add(
                new Meal("MF003","French","Cheese & Tomato Sandwich","Rs. 500.00")
        );

        mealTable.add(
                new Meal("MF004","French","Ham & Cheese Sandwich","Rs. 600.00")
        );

        mealTable.add(
                new Meal("MF005","French","Special Club Sandwich","Rs. 800.00")
        );

        mealTable.add(
                new Meal("MF006","French","Egg Burger","Rs. 400.00")
        );

        mealTable.add(
                new Meal("MF007","French","Chicken Burger","Rs. 500.00")
        );

        mealTable.add(
                new Meal("MF008","French","Chicken Submarine","Rs. 750.00")
        );

        mealTable.add(
                new Meal("MF009","French","Hot Dog","Rs. 650.00")
        );

        mealTable.add(
                new Meal("MF010","French","Meal Pack","Rs. 1750.00")
        );

    }

    static{
        roomsTable.add(
                new Rooms("RS001","Single Room")
        );

        roomsTable.add(
                new Rooms("RS002","Single Room")
        );

        roomsTable.add(
                new Rooms("RS003","Single Room")
        );

        roomsTable.add(
                new Rooms("RS004","Single Room")
        );

        roomsTable.add(
                new Rooms("RS005","Single Room")
        );

        roomsTable.add(
                new Rooms("RD001","Double Room")
        );

        roomsTable.add(
                new Rooms("RD002","Double Room")
        );

        roomsTable.add(
                new Rooms("RD003","Double Room")
        );

        roomsTable.add(
                new Rooms("RD004","Double Room")
        );

        roomsTable.add(
                new Rooms("RD005","Double Room")
        );

        roomsTable.add(
                new Rooms("RD006","Double Room")
        );

        roomsTable.add(
                new Rooms("RD007","Double Room")
        );

        roomsTable.add(
                new Rooms("RD008","Double Room")
        );

        roomsTable.add(
                new Rooms("RD009","Double Room")
        );

        roomsTable.add(
                new Rooms("RD010","Double Room")
        );

        roomsTable.add(
                new Rooms("RT001","Triple Room")
        );

        roomsTable.add(
                new Rooms("RT002","Triple Room")
        );

        roomsTable.add(
                new Rooms("RT003","Triple Room")
        );

        roomsTable.add(
                new Rooms("RT004","Triple Room")
        );

        roomsTable.add(
                new Rooms("RT005","Triple Room")
        );

        roomsTable.add(
                new Rooms("RQ001","Quad Room")
        );

        roomsTable.add(
                new Rooms("RQ002","Quad Room")
        );

        roomsTable.add(
                new Rooms("RQ003","Quad Room")
        );

        roomsTable.add(
                new Rooms("RQ004","Quad Room")
        );

        roomsTable.add(
                new Rooms("RQ005","Quad Room")
        );
    }


    static{
        customerTable.add(
                new Customer("C001","Amal","2563145V","0756914223","amal123@gmail.com","Colombo","Single","Local-Chicken")
        );

        customerTable.add(
                new Customer("C002","Nimal","254575V","07684531566","nimal123@gmail.com","Kandy","Single","Loacal-Fish")
        );

        customerTable.add(
                new Customer("C003","Kamal","6358135V","07045663155","kamal123@gmail.com","Galle","Double","Chinese-Fride rice-Chicken")
        );

        customerTable.add(
                new Customer("C004","Sunil","1278465V","07524576125","sunil123@gmail.com","Matara","Double","French-Submarine")
        );

        customerTable.add(
                new Customer("C005","Bandara","6715340V","0784531734","bandara123@gmail.com","Hambantota","Double","Local-Chicken")
        );

        customerTable.add(
                new Customer("C006","Lakmal","1496582V","0763148625","lakmal123@gmail.com","Kurunagala","Single","Local-Egg")
        );

        customerTable.add(
                new Customer("C006","Nuwan","1247650V","0788561284","nuwan123@gmail.com","Dambulla","Triple","Chinese-Fride rice-Fish")
        );

        customerTable.add(
                new Customer("C007","Praveen","1764386V","0756113522","praveen123@gmail.com","Polonnaruwa","Triple","Local-Egg")
        );


        customerTable.add(
                new Customer("C007","Kumara","2563145V","0711163458","kumara123@gmail.com","Gampaha","Quad","French-Sandwich-Chicken")
        );

        customerTable.add(
                new Customer("C008","Prageeth","8467234V","0701300524","prageeth123@gmail.com","Matale","Double","French-Burger-Chicken")
        );

        customerTable.add(
                new Customer("C009","Wishwa","5634812V","0734896130","wiashwa123@gmail.com","Trinco","Quad","Local-Chicken")
        );

        customerTable.add(
                new Customer("C010","Ruwan","6486315V","0763594026","ruwan123@gmail.com","Anuradhapura","Single","Local-Egg")
        );

    }
    public static boolean contains(Object obj){
        Customer temp=top;
        while(temp!=null){
            if(temp.obj.equals(obj)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

}
