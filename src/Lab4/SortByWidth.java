package Lab4;

import java.util.Comparator;

/**
 * This class sorts an array by width in descending order
 *
 * @version 1.0
 * @author Bets Dmytro
 */

public class SortByWidth implements Comparator<Lab4.Furniture> {

    @Override
    public int compare(Lab4.Furniture o1, Lab4.Furniture o2) {
        if (o1.getWidth() > o2.getWidth())
            return -1;
        else if (o1.getWidth() < o2.getWidth())
            return 1;
        return 0;
    }
}
