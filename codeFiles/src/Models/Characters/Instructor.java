//package Models.Characters;
//
//import Models.Courses.Course;
//import Models.Major;
//
//public class Instructor extends Person {
//    Course teachingSubject;
//
//    //no-arg constructor
//    public Instructor() {
//        super();
//        teachingSubject = new Course(new Major(), 3, new Assignment());
//    }
//
//    public Instructor(String name, Course teachingSubject) {
//        super(name);
//        this.teachingSubject = teachingSubject;
//    }
//
//    public Instructor(Instructor instructor) {
//        super(instructor);
//        teachingSubject = instructor.teachingSubject;
//    }
//
//    public Course getTeachingSubject() {
//        return teachingSubject;
//    }
//}
