public class CoffeeHouse extends Place{

    public CoffeeHouse(String name, String[] menu){
        super(name, menu);
    }

    public void getOrder(){
        System.out.println("Hi, I am " + this.getWorkersName() + ". What drink would you like?");
    }

}
