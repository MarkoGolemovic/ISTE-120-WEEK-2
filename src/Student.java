/**
 * @since 9-10-2021
 */
public class Student {
    //attributes
    private String firstName="Pero";
    private String lastName="Peric";
    private int studentID=111;
    private double GPA=222;

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
     *
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName = lastName;
        this.studentID=0;
        this.GPA=0;
    }

    //getters and setters for firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     *
     * @return
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     *
     * @param lastName
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

