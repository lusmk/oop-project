package Models.Characters;

import Models.Courses.Course;

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


    //getters
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

    public void assignmentEnergy(Course course) throws Exception {
        this.energy -= 25;
        if(energy <= 50) {
            /*
            add options
            eat
            drink
            sleep
            continue working
             */
            System.out.println("Your energy is " + this.energy + ". Please restore your energy:");
        }
    }

}
