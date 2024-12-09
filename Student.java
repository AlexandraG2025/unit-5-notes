/*Example CLASS that defines an OBJECT
Class names lilke Student are always captialized 
Object-Oriented Classes are like BLUEPRINTS
(in other java class, you creat istance from this blueprint)
*/
public class Student {
    //1. INSTANCE VARIABLES (attributes/data/fields)
    // think of what this object "needs to know"
    // must be PRIVATE ("encapsualtion")
    private String name; // "a Studnet has a name"
    private int gradYear;
    private String email;
    private boolean sports;
    private double gpa;


    //2. CONSTRUCTORS (manuals for setting up an object)
    //3. MEHTODS (behvaiors associated with the object type)

    public static void Student(String []args) {
       System.out.println("Hello World");
    }
 }