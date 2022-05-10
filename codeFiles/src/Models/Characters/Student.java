package Models.Characters;

import Models.Cafeteria;
import Models.CoffeeHouse;
import Models.Courses.Course;

import java.util.Scanner;

public class Student extends Person {
    public enum Major {
        COMPUTER_SCIENCE, DATA_SCIENCE, ENGINEERING_SCIENCE,
        BUSINESS, ENGLISH_COMMUNICATIONS, POLITICS_GOVERNANCE}

    private Major major;
    private int semester;
    private Degree degree;// maybe will be changed
    private int energy;

    //Constructors
    //no-arg(not sure if needed)
    public Student() {
        super();
        semester = 1;
        degree = Degree.UNDERGRADUATE;
        major = Major.COMPUTER_SCIENCE;
        energy = 100;
    }
    public Student(String name, Major major, Degree degree, int energy) {
        super(name);
        this.major = major;
        this.degree = degree;
        semester = 1;
        this.energy = energy;
    }

    //copy-constructor(not sure if needed)
    public Student(Student student){
        super(student);
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
        int number = sc.nextInt();
        if(number == 1){
            for(int i = 0; i < Cafeteria.MENU.length; i++){
                System.out.println(Cafeteria.MENU[i]);
            }
        } else if(number == 2) {
            for (int i = 0; i < CoffeeHouse.MENU.length; i++) {
                System.out.println(CoffeeHouse.MENU[i]);
            }
        }else System.out.println("Input 1 or 2");
        String[] menu = Cafeteria.MENU;
        int[] energyGain = new int[menu.length];
        int order = sc.nextInt();
        for(int i = 1; i <= menu.length; i++){
            if(i == order) {
                energyGain[i - 1] = Integer.parseInt(menu[i - 1].split(": ")[1]);
                energy += energyGain[i - 1];
            }
        }
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
