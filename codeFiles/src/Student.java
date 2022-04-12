public class Student extends Person {
    // private Major major;
    private int semester;
    private Degree degree;// maybe will be changed

    //Constructors
    //non-arg(not sure if needed)
    public Student() {
        super();
        semester = 1;
        degree = Degree.UNDERGRADUATE;
    }



}
