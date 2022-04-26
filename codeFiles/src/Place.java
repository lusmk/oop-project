public abstract class Place {
    private String workersName;
    private String[] menu; //TODO: create Menu class, make array of MenuItems


    public Place(String workersName, String[] menu){
        this.workersName = workersName;
        for(int i = 0; i < menu.length; i++){
            this.menu[i] = menu[i];
        }
    }

    //accessors
    public String getWorkersName(){
        return this.workersName;
    }

    //TODO: maybe use clone later
    public String[] getMenu(){
        String[] menuCopy = new String[50];
        for (int i = 0; i < 50; i++)
                menuCopy[i] = this.menu[i];
        return menuCopy;
    }

    //list the items in menu
    public void showMenu(){
        System.out.println("Here's the menu for today: ");
        String[] menu = getMenu();
        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i]);
        }
    }

    //abstract method for seeing the menu
    public abstract void getOrder();
}
