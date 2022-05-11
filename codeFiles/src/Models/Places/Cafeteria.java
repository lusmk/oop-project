package Models.Places;

public class Cafeteria extends Place {
    public static final String[] MENU = {
            "Burger: 6", "Pizza: 5", "Salad: 4", "Fries: 3", "Soup: 7"
    };

    //constructor
    public Cafeteria(String name){
        super(name);
    }
    //accessor for workersName
    public void getOrder(){
        System.out.println("Hi, I am " + this.getWorkersName() + ". What would you like to eat?");

    }
}


