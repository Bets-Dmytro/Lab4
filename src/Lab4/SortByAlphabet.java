package Lab4;

import java.util.Comparator;

/**
 * This class sorts array by alphabet
 *
 * @version 1.0
 * @author Bets Dmytro
 */

public class SortByAlphabet implements Comparator<Lab4.Furniture> {

    @Override
    public int compare(Lab4.Furniture o1, Lab4.Furniture o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
