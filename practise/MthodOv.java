package practise;

class A {
    public void show(){
        System.out.println("Hi");
    }
}

class B extends A{
    public void show(){
        System.out.println("Hello");
    }
    public void hello(){
        System.out.println("hi");
    }
}

public class MthodOv {
    public void start(){
        A obj = new B(); // dynamic refercing
        obj.show();
    
    }
}
