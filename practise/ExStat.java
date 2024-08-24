package practise;

public class ExStat {
    public static int number;
    public String name = "Mihir";
    static {
        number = 5;
        // name = "mihir"; // we cannot declare not static members variables in static
        // block
        // static block is used for assigning the value of static variables
        // it is call only one time not call second time
    }

    class B {
        public void showB() {
            System.out.println("Hello from inner B" + number + " " + name);
        }
    }

    static class C {
        public void showC() {
            // in this show , name will not access because static class can only access the
            // static members
            System.out.println("Hello from inner Static C" + number);
        }
    }

    public void simpleMethod() {
        System.out.println("Hello from simple method" + number);
    }

    public static void show(ExStat obj) {
        // in this show , name will not access because static class can only access the
        // static members
        // if we access then pass the obj as parameter in the method
        System.out.println("Hello from show from outside" + number + " " + obj.name);
    }

}
