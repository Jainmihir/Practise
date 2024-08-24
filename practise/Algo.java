package practise;

import java.util.Scanner;

// import java.util.*;
public class Algo {
    public static boolean isPrime(int n){
        if(n <= 1 ) return false;
        System.out.println(Math.sqrt(n));
        for(int i=2;i<=Math.sqrt(n);i++){
                
                System.out.println(i + " " + n);
                System.out.println(n%i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int findPrime(int n){ //5
        int count =0; // 0 
        int num =1; // 1
        while(count <n){ // 1<5 
            num++;   // 1 2
            if(isPrime(num)){ // 1 2
                count++;
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        

        
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        int answer = findPrime(number);
        System.out.println(answer);
        sc.close();


        

        // Method overiding
        // MthodOv obj = new MthodOv();
        // obj.start();


        // Collections framework
        // Stl obj = new Stl();
        // obj.solutionColl();


        // Stream
        // QuestionStream.question();


        // Object Classes
        // ExObject obj = new ExObject();
        // obj.name = "MIHIR";
        // System.out.println(obj);
        // ExObject obj1 = new ExObject();
        // obj1.name = "MIHIR";
        // // System.out.println(obj == obj1);
        // System.out.println(obj.equals(obj1));
        


        // Stream ans loops
        // List<Integer> ls = Arrays.asList(1,2,3,4,5);
        // Stream is a interface
        // once you work with stream then you can not used stream
        // filter and map returns a stream but reduce returns the result in single value
        // streams makes your work easy because you no the bigdata

        // Stream<Integer> s1 = ls.stream().map(ele -> ele*2).filter(ele -> ele%2==0);
        // s1.forEach(n -> System.out.println(n));

        // int result = ls.stream().reduce(0,(c,e)-> c+e);
        // System.out.println(result);

        // for(int i : ls){
        //     System.out.println(i);
        // }

        // for(int i=0;i<ls.size();i++){
        //     System.out.println(ls.get(i));
        // }

        // Static 
        // ExStat obj = new ExStat(){
        //     public void simpleMethod()
        //     {
        //         System.out.println("Hello from overide the content of simple method by annonymous class" + number);
        //     }
        // };
        // obj.simpleMethod();
    
        // ExStat.show(obj);
        
        // ExStat.B  obj1 = obj.new B(); // so we can access inner class by accessing with object of ExStat class
        // obj1.showB();

        // ExStat.C obj2 = new ExStat.C(); // when we declare static then we cannot access but the object of that classss
        // obj2.showC();







        // Final And Sealed Classes
        // ExSeal obj = new ExSeal();
        // obj.show();
        // B obj1 = new B();
        // obj1.show1();
        // C obj2 = new C();
        // obj2.show2();
        // D obj4 = new D();
        // obj4.show4();



        // Interfaces
        // ExInterfa obj = new ExInterfa() {
        //     public void show(){
        //         System.out.println("Hello from show");
        //     }
        //     public void show1(){
        //         System.out.println("Hello from show1");
        //     }
        // };
        // obj.show();
        // obj.show1();


        // ExInterfa obj = new ExInterfa();
        // obj.show();
        // obj.show1();




        // Abstarct Class 

        // A obj = new ExAbstr(); //dynamic referencing
        // ExAbstr obj = new ExAbstr(); //dynamic referencing
        // obj.show();
        // obj.playMusic();
        // obj.show1();
        // obj.hello();
        // A.start();
    

        // Comparator and Comparable example
        // Comparator<Student> comp =  new Comparator<Student>() {
        //     public int compare(Student i , Student j){
        //         if( i.getMarks() > j.getMarks()){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };

        // Comparator<Student> comp =  (i , j) ->  {
        //         return i.getMarks() > j.getMarks() ? 1 : -1;
        //     };
            
        // Comparator<Student> sortByNames = new Comparator<Student>() {
        //     public int compare(Student s1 , Student s2){
        //         return s1.getName().compareTo(s2.getName());
        //     }
        // };

        // List<Student> obj = new ArrayList<>();
        // obj.add(new Student(25,"Mihir"));
        // obj.add(new Student(26, "Lokit"));
        // obj.add(new Student(21, "MJ"));

        // // obj.sort(comp);
        // // Collections.sort(obj);
        // obj.sort(sortByNames);
        
        // for(Student n : obj){
        //     System.out.println(n.getMarks() + " " + n.getName());
        // }





        // DataStructures

        // Scanner sc = new Scanner(System.in);
        // int n =  sc.nextInt();
        // int nums [] = new int[n];
        
        // for(int i=0;i<n;i++){
        //     nums[i] = sc.nextInt();
        // }

        // Queue q =new Queue();
        // q.enqueue(5);
        // q.enqueue(2);
        // q.enqueue(7);
        // q.enqueue(3);
        // q.remove();
        // q.remove();
        // q.show();

        // stack st = new stack();
        // // st.push(5);
        // // st.push(6);
        // // st.push(6);
        // // st.push(6);
        // // st.push(6);
        // st.show();
        // // int result = st.pop();
        // // st.isEmpty();
        // // System.out.println(result);
        // st.isEmpty();
        // st.peek();

        // binarySearchTree bs = new binarySearchTree();
        // bs.insert(5);
        // bs.insert(6);
        // bs.insert(7);
        // bs.Traverse();


        // LinkedList ls = new LinkedList();
        // ls.insertData(5);
        // ls.insertData(5);
        // ls.print();
        // for(int i=0;i<n;i++){
        //     System.out.print(nums[i]);
        // }

        // int low = 0;
        // int high = n-1;
        // MergeSort.mSort(nums, low, high);
        // for(int i=0;i<n;i++){
        //     System.out.println(nums[i]);
        // }



        // QuickSort q = new QuickSort();
        // int low = 0;
        // int high = n-1;
        // // System.out.print(low + " " + high);
        // QuickSort.qSort(nums, low, high);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        // sc.close();
        
    }
}
