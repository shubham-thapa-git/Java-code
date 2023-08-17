package src.main.Youtube;
public class Constructors {
    /*Constructors must have the same name as the Class and no return type.
     * Constructors cannot be final, abstract or static.
     */
    String fname;
    String lname;
    public Constructors(){
        System.out.println("This is a default constructor");
    }
    /*This is a parameterized constructor
     * This is also constructor overloading
     */
    public Constructors(String a, String b){

        fname = a;
        lname = b;
        System.out.println("This is a parameterised constructor");
    }
    public void display(){
        System.out.println("First Name is "+ fname);
        System.out.println("Last Name is "+ lname);
    }
    public static void main(String[] args) {
        /*Creating object of class
         * when a object of a class is created the default constructor is always called.
         */
        Constructors con = new Constructors();
        Constructors con1 = new Constructors("James", "Blunt");
        con.display();
        con1.display();
    }
}
