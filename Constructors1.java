public class Constructors1 {
    /*Defining a default constructor*/
    public Constructors1(){
        System.out.println("This is a default constructor");
    }
    /*This is a parameterised constructor */
    public Constructors1(int a, String b){}
    public static void main(String[] args) {
        /*creating an objet of the class */
        Constructors1 con = new Constructors1();
        System.out.println(con);
    }
}
