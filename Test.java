public class Test {
    // Instance variable
    int x;
    // Instance block
    {
        // Code to be executed during instance initialization
        x = 10;
        System.out.println("X assigned an value");
    }

    {
        // Code to be executed during instance initialization
        x += 10;
        System.out.println("Added 10 to x");
    }

    // Constructor
    public Test() {
        // Constructor code
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        Test t = new Test();

        System.out.println("Value of x " + t.x);
    }
}