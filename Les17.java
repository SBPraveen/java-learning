import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream; 

public class Les17 {
    public static void main(String[] args) {
        // Create an array
        // Filter even nos
        // Multiply the elements by 2
        // Find the sum of all the elements in the array
        List<Integer> arr = Arrays.asList(22, 11, 33, 44, 2, 100, 8);
        //for each
        arr.forEach(n -> System.out.print(n+" "));

        Stream<Integer> s1 = arr.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // short form
        int res2 = arr.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(res2);
    }
}
