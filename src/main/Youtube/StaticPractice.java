package src.main.Youtube;
public class StaticPractice {
   /*static variable belongs to class and is stored in memory once so,
    * when a static value is incremented in the constructor the value of that variable is updated.
    */
    static int i=0;
    int j=0;

    public StaticPractice(){
        i++;
        j++;

        System.out.println("value of i ="+" "+i);
        System.out.println("value of j ="+" "+j);
    }
    public static void main(String[] args) {
        
        StaticPractice var = new StaticPractice();
        StaticPractice var2 = new StaticPractice();

        /* j can be accessed through object of class as its not a static variable
         * i cannot be accessed through the object because its static, constructors cannot access static variables.
         */
        System.out.println(var.j);
        System.out.println(StaticPractice.i);
        System.out.println(var2);
    }
}
