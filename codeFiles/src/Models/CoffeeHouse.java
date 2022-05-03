package Models;

public class CoffeeHouse extends Place{
    public static final String[] MENU = {
        "Nuts Coffee: 40", "Americano: 60", "Latte: 30", "Cappuccino: 50", "Lemonade: 20"
    };

    public CoffeeHouse(String name){
        super(name);
    }

    public void getOrder(){
        System.out.println("Hi, I am " + this.getWorkersName() + ". What drink would you like?");
    }

//    public static void main(String[] args) {
//        CoffeeHouse cafe = new CoffeeHouse("Silvi");
//
//        cafe.showMenu(CoffeeHouse.MENU);
//
//    }
}
