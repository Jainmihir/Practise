class Parent {
    public void Par(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public void Par(){
        System.out.println("child");
    }
}

public class ExT {
    public static void main(String[] args) {
        Parent p = new Child();
        p.Par();
    }
}
