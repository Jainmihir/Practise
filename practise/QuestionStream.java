package practise;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class QuestionStream {
    public static void question(){
        List<Integer>  li = Arrays.asList(1,20,15,30,12);

        // Sum of all elements with streamApi
        int sum = 0;
        int result = li.stream().reduce(0,(c,e) -> c+e);
        System.out.println(result);

        // Optional<Integer> opSum = list.stream().reduce((a,b) -> a+b);
        // System.out.println(opSum);
        for(int ele : li){
            sum += ele;
        }
        System.out.println(sum);

        //Average of all numbers
        double average =  li.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);


        // find square of number 
        double ave  = li.stream()
                        .map(e -> e*e)
                            .filter(e -> e > 100)
                                .mapToInt(e -> e)
                                    .average()
                                        .getAsDouble();
        System.out.println(ave);

        // even or odd 
        Stream<Integer> even = li.stream().filter(ele -> ele%2==0);
        even.forEach(n -> System.out.print( " " + n));
        System.out.println();
        Stream<Integer> odd = li.stream().filter(ele -> ele%2!=0);
        odd.forEach(n -> System.out.print(" " + n));
        System.out.println();
        List<Integer> eve =  li.stream().filter(e -> e%2==0).collect(Collectors.toList());
        for(int n  : eve){
            System.out.print(n);
        }
        System.out.println();

        // 2 , 222 , 34 , 321 -> only those numbers starting with 2 
        List<Integer> numbers = Arrays.asList(2,-222,321,123,223,234,432);

        List<Integer> numberWith2 = numbers.stream()
                                    .map(e -> String.valueOf(e))
                                    .filter(e -> e.startsWith("2") || e.startsWith("-2"))
                                    .map(e-> Integer.parseInt(e))
                                    .collect(Collectors.toList());
        System.out.println(numberWith2);

        List<Integer> numWithTwo = numbers.stream()
                                    .filter(e -> e.toString().charAt(0) == '2' || e.toString().startsWith("-2"))
                                    .collect(Collectors.toList());
        System.out.println(numWithTwo);


        // print duplicates number 
        List<Integer> dup = Arrays.asList(1,2,3,2,3,1,0,1);
        Set<Integer> ele = dup.stream().filter(e -> Collections.frequency(dup,e) > 1).collect(Collectors.toSet());
        System.out.println(ele);

        // print max and min
        int maxNum =  li.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxNum);
        int minNum =  li.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minNum);
        

        int result2 = li.stream().max((e1,e2) -> e1-e2).get();
        System.out.println(result2);

        //sorted 
        List<Integer> Sorted  = li.stream().sorted().collect(Collectors.toList());
        System.out.println(Sorted);
        List<Integer> reverse = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);

        // get limit numbers
        List<Integer> firstFive =  li.stream().limit(2).collect(Collectors.toList());
        System.out.println(firstFive);
        int sum1 = li.stream().limit(2).reduce(0,(c,e) -> c+e);
        System.out.println(sum1);

        // Skip 
        List<Integer> skipFive = li.stream().skip(2).collect(Collectors.toList());
        System.out.println(skipFive);


        // find second max and min
        int secondMax = li.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondMax);
        int secondMin = li.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondMin);


    }
}
