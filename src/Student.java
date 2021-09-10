/**
 * @since 9-10-2021
 */
public class Student {
    //attributes
    private String firstName;
    private String lastName;
    private int studentID;
    private double GPA;

    //CONSTRUCTORS
    //default constructor
    //Special method whose name is the same as the class
    //They do not return values, no return type, not even void
    //We use constructor to initialize attributes?
    public Student(){
        this.firstName = "John";
        this.lastName = "Doe";
        this.studentID=-1;
        this.GPA=-1;
    }
    //parameterized constructor, requires first and last name

    /**
     * Parmetized constructor
     * @param firstName is first name
     * @param lastName is last name
     * @param studentID is studen unix id
     * @param GPA is student graid point average
     */
    public Student(String firstName, String lastName, int studentID, double GPA){
        this.firstName=firstName;
        this.lastName = lastName;
        this.studentID= studentID;
        this.GPA=GPA;
    }

    //getters and setters for firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     *
     * @return firstName
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     *
     * @param lastName is represeting last name
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public int getStudentID(){
        return this.studentID;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return this.GPA;
    }


    //printing - method for simple print
    public void print(){
        System.out.println("STUDENT:"+this.firstName+" "
                + this.lastName+" "+this.studentID+" "+this.GPA);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.print();
    }


}

