import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quicksort {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 23, 4, 12111, 333, 4, 5));
        List<Integer> sortedArray = quicksort(array);
        System.out.println(sortedArray);
    }

    public static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return new ArrayList<>(arr);
        }

        List<Integer> upper = new ArrayList<>();
        List<Integer> lower = new ArrayList<>();
        int first = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > first) {
                upper.add(arr.get(i));
            } else {
                lower.add(arr.get(i));
            }
        }

        upper = quicksort(upper);
        lower = quicksort(lower);

        List<Integer> result = new ArrayList<>(lower);
        result.add(first);
        result.addAll(upper);

        return result;
    }
}
