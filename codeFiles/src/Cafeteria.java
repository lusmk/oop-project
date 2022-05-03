public class Cafeteria extends Place{
    //constructor
    public Cafeteria(String name, String[] menu){
        super(name, menu);
    }
    //accessor for workersName
    public void getOrder(){
        System.out.println("Hi, I am " + this.getWorkersName() + ". What would you like to eat?");
    }
}
