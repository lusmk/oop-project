public class Person {
    //mutable
    private String name;
    private String id;
    static int counter;

    //Constructors
    //no-arg(not sure is needed)
    public Person() {
        name = "no-name";
        id = "A00000000";
        counter++;
    }

    public Person(String name) {
        this.name = name;
        id = Integer.toString(counter);
        while (id.length() != 8)
            id = "0" + id;
        id = "A" + id;
        System.out.println(id);
        counter++;
    }

    //copy-constructor(not sure is needed)
    //intentionally shallow
    public Person(Person p){
        this.name = p.name;
        this.id = p.id;
    }

    //shallow copy intentional
    public String getName() {
        return name;
    }

    //shallow copy intentional
    public String getId(){
        return id;
    }
}
