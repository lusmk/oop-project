package Models.Places;

public class CoffeeHouse extends Place {
    public static final String[] MENU = {
        "Nuts Coffee: 4", "Americano: 6", "Latte: 3", "Cappuccino: 5", "Lemonade: 2"
    };

    public CoffeeHouse(String name){
        super(name);
    }

    public void getOrder(){
        System.out.println("Hi, I am " + this.getWorkersName()
                + ". What drink would you like?");
    }
}
