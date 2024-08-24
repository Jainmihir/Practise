package practise;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Stl {
    public void solutionColl(){




        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One" ,1);
        // for(Map.Entry<String,Integer> e : numbers.entrySet()){
        //     System.out.print(e.getKey() + e.getValue());
        // }

        // Set<Student> studentSet = new HashSet<>();
        // studentSet.add(new Student(1, "mihir"));
        // studentSet.add(new Student(1, "mihir"));
        // for(Student n : studentSet){
        //     System.out.println(n);
        // }



        Set<Integer> st1 = new TreeSet<>(); // sorted order
        st1.add(1);
        Set<Integer> st2 = new LinkedHashSet<>(); // in linked manner
        st2.add(2);
        Set<Integer> st = new HashSet<> (); // not sorted order
        st.add(1);


        ArrayDeque<Integer> addq = new ArrayDeque<>(); // add first and last are present
        addq.add(1);


        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        pq1.add(1);
        Queue<Integer> pq = new PriorityQueue<>(); // min heap
        pq.offer(12);
        


        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.poll();

      



        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addLast(null);

        // Iterator<Integer> iterator = ll.listIterator();
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        // vector -> thread safe
        Vector<Integer> v = new Vector<>();
        v.add(1);
        System.out.print(v.capacity());





        List<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.getFirst();
        stack.getLast();
        


        int[] nums =  {1,2,3,3,4,5,6};
        // int index = Arrays.binarySearch(nums, 4);
        // System.out.println(index);
        Arrays.sort(nums);
        Arrays.fill(nums,1);


        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(2);
        array.add(4);

        // System.out.println(Collections.min(array));
        // System.out.println(Collections.frequency(array,0));
        Collections.sort(array);
        // array.clear();
        // array.remove(1);
        // array.removeFirst();
        // array.removeAll(array);
        // System.out.println(array.size());
        // for(int ele : array){
        //     System.out.println(ele);
        // }


    }
}
