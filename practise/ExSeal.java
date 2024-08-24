package practise;

// sealed classes give permission to not anyone can access the class but i permit you which class we can access
// non-sealed means anyone can access those clasess
// final cannot bhi inherit final classes
// in interface only sealed or non sealed are their


public sealed class ExSeal permits B,C{
    public void show(){
        System.out.println("Hi I am Sealed class");
    }
}

non-sealed class B extends ExSeal{
    public void show1(){
        System.out.println("Hi I am Non-Sealed class");
    }
}

// When we declare final class we cannot inherited the final class
// if we declare a variable final the no one can change them it is constant
// if we declare the final method then no can overide that method

final class C extends ExSeal{
    public void show2(){
        System.out.println("Hi I am final class");
    }
}

// class D extends B{
//     public void show3(){
//         System.out.println("Hi I am Show 3 final example");
//     }
//     public final void show4(){
//         System.out.println("Hi I am Show 4 final method");
//     }
// }

// class E extends D{
    
//     // public void show4(){
//     //     System.out.println("Hi I am Show 4 final method");
//     // }
// }


// Interfaces 

// sealed interface X permits Y{
//     void show();
// }
// non-sealed interface Y extends X{
//     void show1();
// }
// public class ExSeal implements Y{
//     public void show() {
        
//     }
//     public void show1(){

//     }
// }

