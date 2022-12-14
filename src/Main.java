import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Тизменин башталышы (башталышы,аягы) диапазонундагы максималдуу элементти табуу учун универсалдуу
         * методду жазыныз.
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(12);
        integerList.add(13);
        integerList.add(51);
        integerList.add(19);
        integerList.add(81);
        integerList.add(91);

        List<String> stringList = new ArrayList<>();
        stringList.add("Azak");
        stringList.add("Alisher");
        stringList.add("Bakyt");
        stringList.add("Syimyk");
        stringList.add("Dosbol");

        List<Character> characterList = new ArrayList<>();
        characterList.add('A');
        characterList.add('Z');
        characterList.add('d');
        characterList.add('G');
        characterList.add('h');


        System.out.println(max(integerList, 0, 4));


    }
    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
        T t = Collections.max(list);
        return t;
    }
}