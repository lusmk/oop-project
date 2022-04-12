public class Course {
    //instance variables
    private Major name;
    private int credits;
    private Assignment assignment;

    //no-arg constructor
    public Course() {
        name = new Major();
        credits = 0;
        assignment = new Assignment();
    }

    //second constructor
    public Course(Major name, int credits, Assignment assignment) {
        this.name = new Major(name);
        this.credits = credits;
        this.assignment = new Assignment(assignment);
    }

    //copy constructor
    public Course(Course course) {
        this.name = new Major(course.name);
        this.credits = course.credits;
        this.assignment = new Assignment(course.assignment);
    }

    //accessor for major name
    public Major getName() {
        return new Major(this.name);
    }

    // accessor for credits
    public int getCredits() {
        return this.credits;
    }

    // accessor for assignment
    public Assignment getAssignment() {
        return new Assignment(this.assignment);
    }

}