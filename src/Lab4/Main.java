package Lab4;/*
C11 = 503 % 11 = 8 | Визначити клас меблі, який складається як мінімум з 5-и полів.
 */

import java.util.Arrays;

/**
 * This class creates objects of Lab4.Furniture and sorts them in ascending and descending orders
 *
 * @see Lab4.Furniture
 * @see SortByAlphabet
 * @see SortByWidth
 *
 * @version 1.0
 * @author Bets Dmytro
 */

public class Main {
    public static void main(String[] args) {

        Lab4.Furniture wardrobe = new Lab4.Furniture("Wardrobe", "Black", 215, 80, 40);
        Lab4.Furniture chair = new Lab4.Furniture("Chair", "Black & White", 100, 25, 25);
        Lab4.Furniture table = new Lab4.Furniture("Table", "Dark Grey", 105, 50, 50);
        Lab4.Furniture lamp = new Lab4.Furniture("Lamp", "Beige", 45, 20, 20);
        Lab4.Furniture sofa = new Lab4.Furniture("Sofa", "White", 140, 80, 50);

        Lab4.Furniture[] Array_Furniture = {wardrobe, chair, table, lamp, sofa};
        SortByAlphabet SortTop = new SortByAlphabet();
        SortByWidth SortBottom = new SortByWidth();


        System.out.println("Unsorted array: ");
        ArrayOut(Array_Furniture);

        Arrays.sort(Array_Furniture, SortTop);
        System.out.println("\nSorted by alphabet array: ");
        ArrayOut(Array_Furniture);

        Arrays.sort(Array_Furniture, SortBottom);
        System.out.println("\nSorted by width array: ");
        ArrayOut(Array_Furniture);
    }


    static void ArrayOut(Lab4.Furniture[] Array){
        for (int i = 0; i < Array.length; i++)
        {
            System.out.println(Array[i].getObject());
        }
    }

}

