import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class StreamApi {
    public static void main(String args[]){
        System.out.println("Let's enjoy StreamAPI");

        /**
         * create data
         */
        final int MAX = 100;
        List<Integer> list = new ArrayList<Integer>();
        // System.out.println(Math.round(Math.random() * MAX));

        for(int i=0; i < 100; i++){
            Integer number = Integer.valueOf((int) Math.round(Math.random() * MAX));
            list.add(number);
        }
        // for(Integer num: list){
        //     System.out.print(num + ",");
        // }

        // Stream<Integer> stream = list.stream();
        // stream.forEach(System.out::println);

        Stream<Integer> stream = list.stream()
            .filter(i -> i%2 == 0)
            // .sorted(Comparator.reverseOrder())
            .sorted()
            .distinct();
        System.out.println();
        stream.forEach(System.out::println);

    }
}