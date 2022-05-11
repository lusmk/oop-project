package Models.Characters;

import Models.Places.Cafeteria;
import Models.Places.CoffeeHouse;
import Models.Places.Place;

import java.util.Scanner;

public class Student{
    public enum Major {
        COMPUTER_SCIENCE, DATA_SCIENCE, ENGINEERING_SCIENCE,
        BUSINESS, ENGLISH_COMMUNICATIONS, POLITICS_GOVERNANCE}
    public enum Degree {UNDERGRADUATE, GRADUATE};
    private String name;
    private String id;
    static int counter;
    private Major major;
    private int semester;
    private Degree degree;// maybe will be changed
    private int energy;

    //Constructors
    public Student() {
        name = "no-name";
        id = "A00000000";
        counter++;
        semester = 1;
        degree = Degree.UNDERGRADUATE;
        major = Major.COMPUTER_SCIENCE;
        energy = 100;
    }
    public Student(String name, Major major, Degree degree, int energy) {
        this.name = name;
        id = Integer.toString(counter);
        while (id.length() != 8)
            id = "0" + id;
        id = "A" + id;
        counter++;
        this.major = major;
        this.degree = degree;
        semester = 1;
        this.energy = energy;
    }

    //copy-constructor(not sure if needed)
    public Student(Student student){
        this.name = student.name;
        this.id = student.id;
        this.major = student.major;
        this.degree = student.degree;
        this.semester = student.semester;
        this.energy = student.energy;
    }


    //accessors
    public Major getMajor() {
        return this.major;
    }

    public int getSemester() {
        return this.semester;
    }

    public Degree getDegree() {
        return this.degree;
    }

    public int getEnergy() {
        return this.energy;
    }

    // methods for gaining energy
    public int eatOrDrink(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Cafeteria 2. Coffeehouse");
        Place place;
        String[] menu = null;
        int number = sc.nextInt();
        if(number == 1){
            place = new Cafeteria("Jennie");
            place.getOrder();
            menu = Cafeteria.MENU;
            place.showMenu(menu);
        } else if(number == 2) {
            place = new CoffeeHouse("Lili");
            place.getOrder();
            menu = CoffeeHouse.MENU;
            place.showMenu(menu);
        }else System.out.println("Input 1 or 2");

        int[] energyGain = new int[menu.length];
        int order = sc.nextInt();
        for(int i = 1; i <= menu.length; i++){
            if(i == order) {
                energyGain[i - 1] = Integer.parseInt(menu[i - 1].split(": ")[1]);
                energy += energyGain[i - 1];
            }
        }
        System.out.println("Your energy now is " + energy);
        return energy;
    }

    public int sleep(){
        energy = 100;
        return energy;
    }

    public void assignmentEnergy() {
        this.energy -= 20;
       Scanner sc = new Scanner(System.in);
        if (energy <= 90) {
            System.out.println("Your energy is " + this.energy + ". Please restore your energy: " +
                    "\n 1. go to Cafeteria or CoffeeHouse \n 2. go to sleep \n 3. continue working");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    energy = eatOrDrink();
                    break;
                case 2:
                    energy = sleep();
                    break;
                case 3:
                    energy = this.getEnergy();
                    break;
            }
        }
    }
}
