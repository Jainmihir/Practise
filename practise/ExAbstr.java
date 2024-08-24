package practise;

// abstract class are those class which we are cannot create any objects
// if we declare abstract method then it neccesarily need the abstract class
// if we declare abstrct class then there is no need to declare the abstarct methods
// when we declare absract method then it is compulsory to implement all the methods in child class



abstract class A {
   
    public abstract void show();
    public abstract void show1();
    public void playMusic(){
        System.out.println("Hello form playmusic");
    }
    public static void start(){
        System.out.println("Hello form static");
    };

}

class ExAbstr extends A{
    public void show1(){
        System.out.println("show1 form B ");
    }
    public void show(){
        System.out.println("show form B");
    }
    public void hello(){
        System.out.println("NEW form hello");
    }
}

