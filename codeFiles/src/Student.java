public class Student extends Person {
    private Major major;
    private int semester;
    private Degree degree;// maybe will be changed

    //Constructors
    //no-arg(not sure if needed)
    public Student() {
        super();
        semester = 1;
        degree = Degree.UNDERGRADUATE;
        major = new Major("Computer Science");
    }

    public Student(String name, Major major, Degree degree) {
        super(name);
        this.major = new Major(major);
        this.degree = degree;
        semester = 1;
    }

    //copy-constructor(not sure if needed)
    public Student(Student student){
        super(student);
        this.major = student.major;
        this.degree = student.degree;
        this.semester = student.semester;
    }


    //getters
    public Major getMajor() {
        return major;
    }

    public int getSemester() {
        return semester;
    }

    public Degree getDegree() {
        return degree;
    }
}
