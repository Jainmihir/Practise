package practise;
// In interface by default function are public abstract method
// by default variables are static and final
// by default if we forget all the method interfaces A then that class B also a abstact class
// interface and abstract class will say we are decalaring only methods we cannot create the defination
// you can declare the defination
//  class ->  class -> extends
// interface -> interface -> extends
// interface -> class -> implements
// we cannot create object of abstract class 
// example :
// interface Computer{
    //     void code();
    // }
    
    // class Laptop implements Computer{
    //     public void code(){
    //         System.out.println("this is laptop");
    //     }
    // }
    
    // class Desktop implements Computer{
    //     public void code(){
    //         System.out.println("This is desktop");
    //     }
    // } 
    // class Developer{
    //     public void devApp(Computer device ){
    //         device.code();
    //     }
    // }
    // public class ExampleINterF {
    //     public static void main(String[] args) {
    //         Computer Lap = new Laptop();
    //         Computer Desk = new Desktop();
    
    //         Developer mihir = new Developer();
    //         mihir.devApp(Desk);
    
    //         Developer lokit = new Developer();
    //         lokit.devApp(Lap);
    //     }
    // }
    


interface A{
    void show();
}

interface B extends A{
    void show1();
}

interface C extends B{

}



interface ExInterfa extends C{
    // public void show(){
    //     System.out.println("Hello from show");
    // }  
    // public void show1(){
    //     System.out.println("Hello from show1");
    // }  
}
