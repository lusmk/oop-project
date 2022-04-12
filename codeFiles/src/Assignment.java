public class Assignment {
    // instance variable
    private int numberOfAssignments;

    // no-arg constructor
    public Assignment() {
        numberOfAssignments = 0;
    }

    // second constructor
    public Assignment(int numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }

    //copy constructor
    public Assignment(Assignment assignment) {
        this.numberOfAssignments = assignment.numberOfAssignments;
    }

    //accessor for number of assignment
    public int getNumberOfAssignments() {
        return this.numberOfAssignments;
    }
}