package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homeList, int n) {
        List<String> result = new ArrayList<>();
        List<Home> sortedList = homeList.stream()
                .sorted(Home::compareTo)
                .toList();
       if (n > homeList.size()) {
           int i = 0;
           while (i < homeList.size()) {
               result.add(homeList.get(i).toString());
               i++;
           }
        } else {
           for (int i = 0; i < n; i++) {
               result.add(sortedList.get(i).toString());
           }
       }

        return result;
    }
}
// END
