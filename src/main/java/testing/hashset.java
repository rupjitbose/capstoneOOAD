package testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashset {

    public static void main(String[] args) {
        int[] numbers = {
                1, 55, 666, 43434, 11212, 11323, 55, 22, 33, 546, 64342, 232, 5432, 2444, 113, 333, 666, 4533,
                232
        };
        Set<Integer> hs=new HashSet<Integer>();

        Arrays.stream(numbers).asLongStream().forEach(n->hs.add((int) n));


        hs.forEach(System.out::println);
        System.out.println();
        System.out.println(numbers.length);
        System.out.println(hs.size());

        }

}