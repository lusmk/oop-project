package Models;

public abstract class Place {
    private String workersName;

    public Place(String workersName){
        this.workersName = workersName;
    }

    //accessors
    public String getWorkersName(){
        return this.workersName;
    }

    public void showMenu(String[] menu){
        System.out.println("Here's the menu for today: ");
        for(int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }

    //TODO: maybe use clone later
//    public abstract String[] getMenu();

    //abstract method for seeing the menu
    public abstract void getOrder();
}